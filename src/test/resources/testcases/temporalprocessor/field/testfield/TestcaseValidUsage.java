package io.toolisticon.byoct.jpa.temporalprocessor.testfield;

import javax.persistence.Temporal;

public class TestcaseValidUsage {

    @Temporal(value=javax.persistence.TemporalType.DATE)
    String field;

}