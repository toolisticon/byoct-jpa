package io.toolisticon.byoct.jpa.enumeratedprocessor.testmethod;

import javax.persistence.Enumerated;

public class TestcaseValidUsage {

    @Enumerated()
    String method( String parameter) {
        return null;
    }

}