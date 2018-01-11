package io.toolisticon.byoct.jpa.joincolumnsprocessor.testfield;

import javax.persistence.JoinColumns;

public class TestcaseValidUsage {

    @JoinColumns(value={@javax.persistence.JoinColumn()})
    String field;

}