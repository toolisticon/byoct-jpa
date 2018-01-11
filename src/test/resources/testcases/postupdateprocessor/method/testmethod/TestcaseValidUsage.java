package io.toolisticon.byoct.jpa.postupdateprocessor.testmethod;

import javax.persistence.PostUpdate;

public class TestcaseValidUsage {

    @PostUpdate()
    String method( String parameter) {
        return null;
    }

}