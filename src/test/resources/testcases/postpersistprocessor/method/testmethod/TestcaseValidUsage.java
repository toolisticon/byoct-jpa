package io.toolisticon.byoct.jpa.postpersistprocessor.testmethod;

import javax.persistence.PostPersist;

public class TestcaseValidUsage {

    @PostPersist()
    String method( String parameter) {
        return null;
    }

}