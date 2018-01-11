package io.toolisticon.byoct.jpa.prepersistprocessor.testmethod;

import javax.persistence.PrePersist;

public class TestcaseValidUsage {

    @PrePersist()
    String method( String parameter) {
        return null;
    }

}