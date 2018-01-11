package io.toolisticon.byoct.jpa.attributeoverrideprocessor.testinterface;

import javax.persistence.AttributeOverride;

@AttributeOverride(name="STRING", column=@javax.persistence.Column())
public interface TestcaseValidUsage {

}