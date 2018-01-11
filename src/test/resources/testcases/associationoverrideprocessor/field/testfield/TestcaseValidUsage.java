package io.toolisticon.byoct.jpa.associationoverrideprocessor.testfield;

import javax.persistence.AssociationOverride;

public class TestcaseValidUsage {

    @AssociationOverride(name="STRING")
    String field;

}