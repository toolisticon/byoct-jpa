package io.toolisticon.byoct.jpa.sequencegeneratorprocessor.testmethod;

import javax.persistence.SequenceGenerator;

public class TestcaseValidUsage {

    @SequenceGenerator(name="STRING")
    String method( String parameter) {
        return null;
    }

}