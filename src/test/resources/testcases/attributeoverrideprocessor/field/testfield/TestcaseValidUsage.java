package io.toolisticon.byoct.jpa.attributeoverrideprocessor.testfield;

import javax.persistence.AttributeOverride;

public class TestcaseValidUsage {

    @AttributeOverride(name="STRING", column=@javax.persistence.Column())
    String field;

}