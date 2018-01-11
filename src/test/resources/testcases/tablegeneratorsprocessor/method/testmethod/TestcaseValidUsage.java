package io.toolisticon.byoct.jpa.tablegeneratorsprocessor.testmethod;

import javax.persistence.TableGenerators;

public class TestcaseValidUsage {

    @TableGenerators(value={@javax.persistence.TableGenerator(name="STRING")})
    String method( String parameter) {
        return null;
    }

}