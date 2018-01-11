package io.toolisticon.byoct.jpa.transientprocessor.testmethod;

import javax.persistence.Transient;

public class TestcaseValidUsage {

    @Transient()
    String method( String parameter) {
        return null;
    }

}