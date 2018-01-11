package io.toolisticon.byoct.jpa.convertsprocessor.testmethod;

import javax.persistence.Converts;

public class TestcaseValidUsage {

    @Converts(value={@javax.persistence.Convert()})
    String method( String parameter) {
        return null;
    }

}