package io.toolisticon.byoct.jpa.manytooneprocessor.testmethod;

import javax.persistence.ManyToOne;

public class TestcaseValidUsage {

    @ManyToOne()
    String method( String parameter) {
        return null;
    }

}