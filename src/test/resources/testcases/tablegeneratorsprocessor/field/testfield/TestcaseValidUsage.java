package io.toolisticon.byoct.jpa.tablegeneratorsprocessor.testfield;

import javax.persistence.TableGenerators;

public class TestcaseValidUsage {

    @TableGenerators(value={@javax.persistence.TableGenerator(name="STRING")})
    String field;

}