package io.toolisticon.byoct.jpa.elementcollectionprocessor.testmethod;

import javax.persistence.ElementCollection;

public class TestcaseValidUsage {

    @ElementCollection()
    String method( String parameter) {
        return null;
    }

}