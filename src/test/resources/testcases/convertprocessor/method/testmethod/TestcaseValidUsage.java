package io.toolisticon.byoct.jpa.convertprocessor.testmethod;

import javax.persistence.Convert;

public class TestcaseValidUsage {

    @Convert()
    String method( String parameter) {
        return null;
    }

}