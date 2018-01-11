package io.toolisticon.byoct.jpa.postremoveprocessor.testmethod;

import javax.persistence.PostRemove;

public class TestcaseValidUsage {

    @PostRemove()
    String method( String parameter) {
        return null;
    }

}