package io.toolisticon.byoct.jpa.mapkeycolumnprocessor.testmethod;

import javax.persistence.MapKeyColumn;

public class TestcaseValidUsage {

    @MapKeyColumn()
    String method( String parameter) {
        return null;
    }

}