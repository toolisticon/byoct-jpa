package io.toolisticon.byoct.jpa.attributeoverridesprocessor.testclass;

import javax.persistence.AttributeOverrides;

@AttributeOverrides(value={@javax.persistence.AttributeOverride(name="STRING", column=@javax.persistence.Column())})
public class TestcaseValidUsage {

}