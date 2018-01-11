package io.toolisticon.byoct.jpa.lobprocessor.testmethod;

import javax.persistence.Lob;

public class TestcaseValidUsage {

    @Lob()
    String method( String parameter) {
        return null;
    }

}