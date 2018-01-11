package io.toolisticon.byoct.jpa.mapkeytemporalprocessor.testmethod;

import javax.persistence.MapKeyTemporal;

public class TestcaseValidUsage {

    @MapKeyTemporal(value=javax.persistence.TemporalType.DATE)
    String method( String parameter) {
        return null;
    }

}