package io.toolisticon.byoct.jpa.attributeoverridesprocessor.testfield;

import javax.persistence.AttributeOverrides;

public class TestcaseValidUsage {

    @AttributeOverrides(value={@javax.persistence.AttributeOverride(name="STRING", column=@javax.persistence.Column())})
    String field;

}