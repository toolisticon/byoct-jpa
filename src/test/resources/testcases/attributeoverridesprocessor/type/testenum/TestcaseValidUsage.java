package io.toolisticon.byoct.jpa.attributeoverridesprocessor.testenum;

import javax.persistence.AttributeOverrides;

@AttributeOverrides(value={@javax.persistence.AttributeOverride(name="STRING", column=@javax.persistence.Column())})
public enum TestcaseValidUsage {

}