package io.toolisticon.byoct.jpa.onetooneprocessor.testmethod;

import javax.persistence.OneToOne;

public class TestcaseValidUsage {

    @OneToOne()
    String method( String parameter) {
        return null;
    }

}