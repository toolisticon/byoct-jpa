package io.toolisticon.byoct.jpa.postloadprocessor.testmethod;

import javax.persistence.PostLoad;

public class TestcaseValidUsage {

    @PostLoad()
    String method( String parameter) {
        return null;
    }

}