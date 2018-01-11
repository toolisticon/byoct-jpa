package io.toolisticon.byoct.jpa.sequencegeneratorsprocessor.testfield;

import javax.persistence.SequenceGenerators;

public class TestcaseValidUsage {

    @SequenceGenerators(value={@javax.persistence.SequenceGenerator(name="STRING")})
    String field;

}