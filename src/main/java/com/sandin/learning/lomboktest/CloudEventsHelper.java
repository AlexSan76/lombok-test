package com.sandin.learning.lomboktest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.UtilityClass;


@UtilityClass
public class CloudEventsHelper {

    public static String getReference(){
        return "ref.-1";
    }

    @FieldNameConstants(asEnum = true, innerTypeName = "Extensions")
    @NoArgsConstructor
    public static class Extension {
        private final String cmdnumber;
        private final String toma_ya;
    }

}
