package io.toolisticon.byoct.jpa.attributeoverridesprocessor.testmethod;

import javax.persistence.AttributeOverrides;

public class TestcaseValidUsage {

    @AttributeOverrides(value={@javax.persistence.AttributeOverride(name="STRING", column=@javax.persistence.Column())})
    String method( String parameter) {
        return null;
    }

}