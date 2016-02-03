package com.pearson.daalt.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


@Generated("org.jsonschema2pojo")
public enum MessageTypeCode {

    ASSESSMENT_ITEM_COMPLETION("Assessment_Item_Completion"),
    ASSESSMENT_PERFORMANCE("Assessment_Performance"),
    ASSESSMENT("Assessment"),
    COURSE("Course"),
    COURSE_SECTION("Course_Section"),
    COURSE_SECTION_TO_LEARNING_RESOURCE("Course_Section_To_Learning_Resource"),
    COURSE_TO_LEARNING_RESOURCE("Course_To_Learning_Resource"),
    PRODUCT("Product"),
    PRODUCT_TO_COURSE("Product_To_Course"),
    PRODUCT_TO_COURSE_SECTION_PLT("Product_To_Course_Section_PLT"),
    MULTI_VALUE_QUESTION_USER_ANSWERED("Multi_Value_Question_User_Answered"),
    SIMPLE_WRITING_QUESTION_USER_ANSWERED("Simple_Writing_Question_User_Answered"),
    TIME_ON_TASK_USER_LOADS_QUESTION("Time_On_Task_User_Loads_Question"),
    TIME_ON_TASK_USER_UNLOADS_QUESTION("Time_On_Task_User_Unloads_Question"),
    USER_LOADS_CONTENT("User_Loads_Content"),
    USER_LOADS_NON_BOOK_CONTENT_WITH_ASSIGNMENT("User_Loads_Non_Book_Content_With_Assignment"),
    USER_LOADS_NON_BOOK_CONTENT_WITHOUT_ASSIGNMENT("User_Loads_Non_Book_Content_Without_Assignment"),
    USER_UNLOADS_CONTENT("User_Unloads_Content"),
    USER_UNLOADS_NON_BOOK_CONTENT_WITH_ASSIGNMENT("User_Unloads_Non_Book_Content_With_Assignment"),
    USER_UNLOADS_NON_BOOK_CONTENT_WITHOUT_ASSIGNMENT("User_Unloads_Non_Book_Content_Without_Assignment"),
    LEARNING_MODULE_CONTENT("Learning_Module_Content"),
    LEARNING_MODULE("Learning_Module"),
    LEARNING_RESOURCE_RELATIONSHIP("Learning_Resource_Relationship"),
    LEARNING_RESOURCE("Learning_Resource"),
    PERSON_COURSE_SECTION("Person_Course_Section"),
    PERSON_CUSTOMIZE_ASSESSMENT("Person_Customize_Assessment"),
    PRODUCT_DELIVERY_PLATFORM_PLT("Product_Delivery_Platform_PLT"),
    PERSON("Person"),
    ASSESSMENT_ITEM_POSSIBLE_ANSWERS("Assessment_Item_Possible_Answers"),
    USER_ANSWERED_ITEM_WITH_UNKNOWN_FORMAT("User_Answered_Item_With_Unknown_Format");

    private final String value;
    private static Map<String, MessageTypeCode> constants = new HashMap<String, MessageTypeCode>();

    static{
        for (MessageTypeCode c : values()) {
            constants.put(c.value, c);
        }
    }


    private MessageTypeCode(String value) {

        this.value = value;
    }


    @JsonValue
    @Override
    public String toString() {

        return this.value;
    }


    @JsonCreator
    public static MessageTypeCode fromValue(String value) {

        MessageTypeCode constant = constants.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}