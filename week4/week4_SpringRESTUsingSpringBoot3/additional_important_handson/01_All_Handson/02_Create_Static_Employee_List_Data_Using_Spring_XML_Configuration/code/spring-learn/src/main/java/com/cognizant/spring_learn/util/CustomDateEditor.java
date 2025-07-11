package com.cognizant.spring_learn.util;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateEditor extends PropertyEditorSupport {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void setAsText(String text) {
        try {
            Date date = dateFormat.parse(text);
            setValue(date);
        } catch (Exception e) {
            setValue(null);
        }
    }
}
