package com.sandin.learning.lomboktest;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldNameConstants;

@FieldNameConstants(asEnum = true)
@AllArgsConstructor
public class Extension {

    private final String cmdnumber;

}
