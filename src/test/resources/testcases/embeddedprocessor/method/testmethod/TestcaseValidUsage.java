package io.toolisticon.byoct.jpa.embeddedprocessor.testmethod;

import javax.persistence.Embedded;

public class TestcaseValidUsage {

    @Embedded()
    String method( String parameter) {
        return null;
    }

}