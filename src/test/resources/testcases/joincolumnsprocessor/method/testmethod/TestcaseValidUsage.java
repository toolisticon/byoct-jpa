package io.toolisticon.byoct.jpa.joincolumnsprocessor.testmethod;

import javax.persistence.JoinColumns;

public class TestcaseValidUsage {

    @JoinColumns(value={@javax.persistence.JoinColumn()})
    String method( String parameter) {
        return null;
    }

}