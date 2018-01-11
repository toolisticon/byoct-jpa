package io.toolisticon.byoct.jpa.primarykeyjoincolumnsprocessor.testmethod;

import javax.persistence.PrimaryKeyJoinColumns;

public class TestcaseValidUsage {

    @PrimaryKeyJoinColumns(value={@javax.persistence.PrimaryKeyJoinColumn()})
    String method( String parameter) {
        return null;
    }

}