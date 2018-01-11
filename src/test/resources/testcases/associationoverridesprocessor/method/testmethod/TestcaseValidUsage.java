package io.toolisticon.byoct.jpa.associationoverridesprocessor.testmethod;

import javax.persistence.AssociationOverrides;

public class TestcaseValidUsage {

    @AssociationOverrides(value={@javax.persistence.AssociationOverride(name="STRING")})
    String method( String parameter) {
        return null;
    }

}