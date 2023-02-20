# Part C (API test automation) :
# Verify The CREATE , UPDATE, GET, DELETE APIs of User Service

@API @QuestionThree @assignment
Feature: Verify The CREATE , UPDATE, GET, DELETE APIs of User Service

  @createUserAPI
  Scenario Outline: Verifying the CREATE USER API <TEST_SCENARIO_NAME>
    Given User Invoke the "CREATE" User API service to execute the "<TEST_SCENARIO_NAME>" test scenario
    Then Validate the Response Status Code
    Then Validate the response json schema
    And Validate the Response Body
    Examples:
      | TEST_SCENARIO_NAME                                   |
      | postUser_valid_BodyDefined_Is_Yes                    |
      | postUser_BodyDefined_Is_No                           |
      | postUser_BodyApplicationJsonType_Is_NotObject        |
      | postUser_BodyApplicationJsonValueProperties_Are_Null |

  @getUserAPI
  Scenario Outline: Verifying the GET USER API <TEST_SCENARIO_NAME>
    Given User Invoke the "GET" User API service to execute the "<TEST_SCENARIO_NAME>" test scenario
    Then Validate the Response Status Code
    Then Validate the response json schema
    And Validate the Response Body
    Examples:
      | TEST_SCENARIO_NAME                                             |
      | getUser_valid_usernameDefined_Is_Yes                           |
      | getUser_invalid_usernameDefined_Is_Yes                         |
      | getUser_username_Is_Null                                       |
      | getUser_invalid_usernameDefined_Is_Yes_with_special_characters |


  @updateUserAPI @API
  Scenario Outline: Verifying the UPDATE USER API <TEST_SCENARIO_NAME>
    Given User Invoke the "UPDATE" User API service to execute the "<TEST_SCENARIO_NAME>" test scenario
    Then Validate the Response Status Code
    Then Validate the response json schema
    And Validate the Response Body
    Examples:
      | TEST_SCENARIO_NAME                                               |
      | putUser_valid_Username_validBodyDefined_Is_Yes                   |
      | putUser_invalid_Username_validBodyDefined_Is_Yes                 |
      | putUser_username_Is_Null_validBodyDefined_Is_Yes                 |
      | putUser_username_with_special_Characters_validBodyDefined_Is_Yes |
      | putUser_valid_Username_BodyDefined_Is_No                         |
      | putUser_invalid_Username_BodyDefined_Is_No                       |
      | putUser_valid_Username_BodyApplicationJsonType_Is_NotObject      |
      | putUser_valid_Username_BodyApplicationJsonType_Are_null          |


  @deleteUserAPI @API
  Scenario Outline: Verifying the DELETE USER API <TEST_SCENARIO_NAME>
    Given User Invoke the "DELETE" User API service to execute the "<TEST_SCENARIO_NAME>" test scenario
    Then Validate the Response Status Code
    Then Validate the response json schema
    And Validate the Response Body
    Examples:
      | TEST_SCENARIO_NAME                                                |
      | deleteUser_valid_userNameDefined_isYes                            |
      | deleteUser_invalid_UsernameDefined_Is_Yes                         |
      | deleteUser_invalid_usernameDefined_Is_Yes_with_special_characters |
      | deleteUser_username_Is_Null                                       |
