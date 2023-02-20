package com.cloudmore.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code", "type", "message"})
@Data
public class ApiResponseObject {

    @JsonProperty("code")
    private int code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("message")
    private String message;

}


