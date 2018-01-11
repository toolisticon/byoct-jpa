package io.toolisticon.byoct.jpa.attributeoverridesprocessor.testinterface;

import javax.persistence.AttributeOverrides;

@AttributeOverrides(value={@javax.persistence.AttributeOverride(name="STRING", column=@javax.persistence.Column())})
public interface TestcaseValidUsage {

}