package io.toolisticon.byoct.jpa.temporalprocessor.testmethod;

import javax.persistence.Temporal;

public class TestcaseValidUsage {

    @Temporal(value=javax.persistence.TemporalType.DATE)
    String method( String parameter) {
        return null;
    }

}