package io.toolisticon.byoct.jpa.orderbyprocessor.testmethod;

import javax.persistence.OrderBy;

public class TestcaseValidUsage {

    @OrderBy()
    String method( String parameter) {
        return null;
    }

}