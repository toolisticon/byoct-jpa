package io.toolisticon.byoct.jpa.preremoveprocessor.testmethod;

import javax.persistence.PreRemove;

public class TestcaseValidUsage {

    @PreRemove()
    String method( String parameter) {
        return null;
    }

}