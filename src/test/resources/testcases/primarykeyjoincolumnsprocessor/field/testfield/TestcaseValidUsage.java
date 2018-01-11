package io.toolisticon.byoct.jpa.primarykeyjoincolumnsprocessor.testfield;

import javax.persistence.PrimaryKeyJoinColumns;

public class TestcaseValidUsage {

    @PrimaryKeyJoinColumns(value={@javax.persistence.PrimaryKeyJoinColumn()})
    String field;

}