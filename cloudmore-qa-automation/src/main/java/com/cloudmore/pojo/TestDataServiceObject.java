package com.cloudmore.pojo;

import com.poiji.annotation.ExcelCellName;
import lombok.Data;

@Data
public class TestDataServiceObject {

    @ExcelCellName("TestScenarioName")
    private String testScenarioName;
    @ExcelCellName("Api")
    private String api;
    @ExcelCellName("EndPoint")
    private String endpoint;
    @ExcelCellName("Request")
    private String requestObj;
    @ExcelCellName("Response")
    private String responseObj;
    @ExcelCellName("StatusCode")
    private int statusCode;
    @ExcelCellName("ResponseObjectType")
    private String responseObjectType;

}
