package io.toolisticon.byoct.jpa.attributeoverrideprocessor.testmethod;

import javax.persistence.AttributeOverride;

public class TestcaseValidUsage {

    @AttributeOverride(name="STRING", column=@javax.persistence.Column())
    String method( String parameter) {
        return null;
    }

}