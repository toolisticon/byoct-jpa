package io.toolisticon.byoct.jpa.mapkeyjoincolumnsprocessor.testmethod;

import javax.persistence.MapKeyJoinColumns;

public class TestcaseValidUsage {

    @MapKeyJoinColumns(value={@javax.persistence.MapKeyJoinColumn()})
    String method( String parameter) {
        return null;
    }

}