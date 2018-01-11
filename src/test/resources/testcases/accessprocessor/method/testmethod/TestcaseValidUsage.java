package io.toolisticon.byoct.jpa.accessprocessor.testmethod;

import javax.persistence.Access;

public class TestcaseValidUsage {

    @Access(value=javax.persistence.AccessType.FIELD)
    String method( String parameter) {
        return null;
    }

}