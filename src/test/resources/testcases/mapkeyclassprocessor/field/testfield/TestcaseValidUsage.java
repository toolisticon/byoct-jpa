package io.toolisticon.byoct.jpa.mapkeyclassprocessor.testfield;

import javax.persistence.MapKeyClass;

public class TestcaseValidUsage {

    @MapKeyClass(value=java.lang.Object.class)
    String field;

}