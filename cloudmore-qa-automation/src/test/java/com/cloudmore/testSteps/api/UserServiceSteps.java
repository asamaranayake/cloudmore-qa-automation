package com.cloudmore.testSteps.api;

import com.cloudmore.apiServices.UserService;
import com.cloudmore.data.TestDataManager;
import com.cloudmore.pojo.ApiResponseObject;
import com.cloudmore.pojo.TestDataServiceObject;
import com.cloudmore.utils.PropertyFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.File;

public class UserServiceSteps {

    UserService userServiceObj = new UserService();

    TestDataManager testDataManager = new TestDataManager();

    TestDataServiceObject testDataServiceObj;
    RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    Response userServiceResponse;


    @Given("Set Path Parameter as {string}")
    public void set_path_parameter(String path) {
        if (path.equals("NULL")) {
            path = "";
        }
        requestSpecBuilder.addPathParam("username", path);
    }

    @When("User Invoke the {string} User API service to execute the {string} test scenario")
    public void get_user_api_service_called(String userServiceType, String testScenario) {

        requestSpecBuilder.addHeader("accept", "application/json");
        testDataServiceObj = testDataManager.getTestCaseDataByName(testScenario);
        String endPoint = testDataServiceObj.getEndpoint();

        switch (userServiceType) {
            case "CREATE":
                requestSpecBuilder.addHeader("Content-type", "application/json");
                if (!testDataServiceObj.getRequestObj().equalsIgnoreCase("EMPTY")) {
                    requestSpecBuilder.setBody(testDataServiceObj.getRequestObj());
                }
                userServiceResponse = userServiceObj.createUserApiInvoker(requestSpecBuilder,endPoint);
                break;
            case "DELETE":
                userServiceResponse = userServiceObj.deleteUserApiInvoker(requestSpecBuilder, endPoint);
                break;
            case "UPDATE":
                requestSpecBuilder.addHeader("Content-type", "application/json");
                if (!testDataServiceObj.getRequestObj().equalsIgnoreCase("EMPTY")) {
                    requestSpecBuilder.setBody(testDataServiceObj.getRequestObj());
                }
                userServiceResponse = userServiceObj.updateUserApiInvoker(requestSpecBuilder, endPoint);
                break;
            case "GET":
                userServiceResponse = userServiceObj.getUserApiInvoker(requestSpecBuilder, endPoint);
                break;
        }
    }


    @Then("Validate the Response Status Code")
    public void validateResponseStatusCode() {
        Assert.assertEquals(userServiceResponse.statusCode(), testDataServiceObj.getStatusCode(), "Expected status code is not match with actual status code");
    }

    @Then("Validate the Response Body")
    public void validateResponseBody() {
        Assert.assertEquals(userServiceResponse.getBody().asPrettyString(), testDataServiceObj.getResponseObj(), "Expected Response is not match with actual Response body");
    }

    @Then("The API call is getting Error with status code {string}")
    public void verify_user_service_error_status_code(String statusCode) {
        Assert.assertEquals(userServiceResponse.statusCode(), Integer.parseInt(statusCode), "Expected status code is not match with actual status code");
        Assert.assertEquals(userServiceResponse.getBody().as(ApiResponseObject.class).getType(), "error", "Expected type is not match with actual status code");
    }

    @Then("Verify the Error message is showing as {string} in the response")
    public void verify_status_code(String errorMessage) {
        Assert.assertEquals(userServiceResponse.getBody().as(ApiResponseObject.class).getMessage(), errorMessage, "Expected type is not match with actual status code");
    }

    @Then("Validate the response json schema")
    public void validate_json_schema() {
        String jsonSchemaPath = null;

        try {
            switch (testDataServiceObj.getResponseObjectType()) {
                case "API":
                    jsonSchemaPath = PropertyFileReader.getInstance().getProperty("commonApiResponse.schema.path");
                    break;
                case "USER":
                    jsonSchemaPath = PropertyFileReader.getInstance().getProperty("userResponse.schema.path");
                    break;
            }
            assert jsonSchemaPath != null;
            userServiceResponse.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(jsonSchemaPath)));
        } catch (Exception e) {
            Assert.fail("Got exception when trying to validate the schema files", e);
        }
    }


}
