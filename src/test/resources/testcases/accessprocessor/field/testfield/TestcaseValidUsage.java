package io.toolisticon.byoct.jpa.accessprocessor.testfield;

import javax.persistence.Access;

public class TestcaseValidUsage {

    @Access(value=javax.persistence.AccessType.FIELD)
    String field;

}