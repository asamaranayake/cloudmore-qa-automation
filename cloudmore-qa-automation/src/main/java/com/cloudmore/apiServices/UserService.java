package com.cloudmore.apiServices;

import com.cloudmore.constants.URIs;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class UserService {

    /**
     * @param createUserSpecBuilderObj
     * @return io.restassured.response Object
     */
    public Response createUserApiInvoker(RequestSpecBuilder createUserSpecBuilderObj,String pathParam) {
        return given().log().all()
                .spec(createUserSpecBuilderObj.build())
                .post(URIs.BASE_URI+pathParam )
                .then().log().all().using().extract().response();
    }

    /**
     * @param deleteUserSpecBuilderObj
     * @return io.restassured.response Object
     */
    public Response deleteUserApiInvoker(RequestSpecBuilder deleteUserSpecBuilderObj, String pathParam) {
        return given().log().all()
                .spec(deleteUserSpecBuilderObj.build())
                .delete(URIs.BASE_URI + pathParam)
                .then().log().all().using().extract().response();
    }

    /**
     * @param getUserSpecBuilderObj
     * @return io.restassured.response Object
     */
    public Response getUserApiInvoker(RequestSpecBuilder getUserSpecBuilderObj, String pathParam) {
        return given().log().all()
                .spec(getUserSpecBuilderObj.build())
                .get(URIs.BASE_URI + pathParam)
                .then().log().all().using().extract().response();
    }

    /**
     * @param updateUserSpecBuilderObj
     * @return io.restassured.response Object
     */
    public Response updateUserApiInvoker(RequestSpecBuilder updateUserSpecBuilderObj, String pathParam) {
        return given().log().all()
                .spec(updateUserSpecBuilderObj.build())
                .put(URIs.BASE_URI + pathParam)
                .then().log().all().using().extract().response();
    }
}
