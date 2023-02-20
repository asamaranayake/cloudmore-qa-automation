package com.cloudmore.data;

import com.cloudmore.pojo.TestDataServiceObject;
import com.cloudmore.utils.PropertyFileReader;
import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class TestDataManager {

    String testCaseExcelFilePath = PropertyFileReader.getInstance().getProperty("data.file.path");

    public List<TestDataServiceObject> getListFromExcelData() {
        return Poiji.fromExcel(new File(testCaseExcelFilePath), TestDataServiceObject.class);
    }

    public TestDataServiceObject getTestCaseDataByName(String name) {

        TestDataServiceObject testDataServiceObject = new TestDataServiceObject();

        List<TestDataServiceObject> testDataList = getListFromExcelData();
        for (TestDataServiceObject testDataObj : testDataList) {
            if (testDataObj.getTestScenarioName().equals(name)) {
                testDataServiceObject = testDataObj;
                break;
            }
        }
        return testDataServiceObject;
    }

}
