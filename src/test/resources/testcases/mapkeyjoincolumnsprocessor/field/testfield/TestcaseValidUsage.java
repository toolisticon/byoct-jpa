package io.toolisticon.byoct.jpa.mapkeyjoincolumnsprocessor.testfield;

import javax.persistence.MapKeyJoinColumns;

public class TestcaseValidUsage {

    @MapKeyJoinColumns(value={@javax.persistence.MapKeyJoinColumn()})
    String field;

}