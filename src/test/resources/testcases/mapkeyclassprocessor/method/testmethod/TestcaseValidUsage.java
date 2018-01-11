package io.toolisticon.byoct.jpa.mapkeyclassprocessor.testmethod;

import javax.persistence.MapKeyClass;

public class TestcaseValidUsage {

    @MapKeyClass(value=java.lang.Object.class)
    String method( String parameter) {
        return null;
    }

}