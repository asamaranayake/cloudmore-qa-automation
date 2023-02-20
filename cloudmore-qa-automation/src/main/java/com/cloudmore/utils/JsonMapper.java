package com.cloudmore.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonMapper {
    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    /**
     *
     * @return
     */
    private static ObjectMapper getDefaultObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // ObjectMapper customization goes here
        return objectMapper;
    }

    /**
     *
     * @param src
     * @return
     * @throws IOException
     */
    public static JsonNode parse(String src) throws IOException {
        return objectMapper.readTree(new File(src));
    }

    /**
     *
     * @param node
     * @param className
     * @param <A>
     * @return
     * @throws JsonProcessingException
     */
    public static <A> A fromJson(JsonNode node, Class<A> className) throws JsonProcessingException {
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return objectMapper.treeToValue(node, className);
    }

    /**
     * Returns the String representation of Json object
     * @param object
     * @return
     */
    public static String getJsonStringFromObject(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
