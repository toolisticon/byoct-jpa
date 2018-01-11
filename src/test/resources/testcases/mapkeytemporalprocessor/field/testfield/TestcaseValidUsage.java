package io.toolisticon.byoct.jpa.mapkeytemporalprocessor.testfield;

import javax.persistence.MapKeyTemporal;

public class TestcaseValidUsage {

    @MapKeyTemporal(value=javax.persistence.TemporalType.DATE)
    String field;

}