package io.toolisticon.byoct.jpa.sequencegeneratorsprocessor.testmethod;

import javax.persistence.SequenceGenerators;

public class TestcaseValidUsage {

    @SequenceGenerators(value={@javax.persistence.SequenceGenerator(name="STRING")})
    String method( String parameter) {
        return null;
    }

}