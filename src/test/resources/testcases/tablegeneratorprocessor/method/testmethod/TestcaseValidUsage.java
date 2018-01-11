package io.toolisticon.byoct.jpa.tablegeneratorprocessor.testmethod;

import javax.persistence.TableGenerator;

public class TestcaseValidUsage {

    @TableGenerator(name="STRING")
    String method( String parameter) {
        return null;
    }

}