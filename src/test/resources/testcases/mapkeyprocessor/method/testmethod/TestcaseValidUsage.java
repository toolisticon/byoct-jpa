package io.toolisticon.byoct.jpa.mapkeyprocessor.testmethod;

import javax.persistence.MapKey;

public class TestcaseValidUsage {

    @MapKey()
    String method( String parameter) {
        return null;
    }

}