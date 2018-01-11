package io.toolisticon.byoct.jpa.preupdateprocessor.testmethod;

import javax.persistence.PreUpdate;

public class TestcaseValidUsage {

    @PreUpdate()
    String method( String parameter) {
        return null;
    }

}