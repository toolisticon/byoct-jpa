package io.toolisticon.byoct.jpa.convertsprocessor.testfield;

import javax.persistence.Converts;

public class TestcaseValidUsage {

    @Converts(value={@javax.persistence.Convert()})
    String field;

}