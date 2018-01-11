package io.toolisticon.byoct.jpa.associationoverrideprocessor.testmethod;

import javax.persistence.AssociationOverride;

public class TestcaseValidUsage {

    @AssociationOverride(name="STRING")
    String method( String parameter) {
        return null;
    }

}