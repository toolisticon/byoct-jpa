package io.toolisticon.byoct.jpa.associationoverridesprocessor.testfield;

import javax.persistence.AssociationOverrides;

public class TestcaseValidUsage {

    @AssociationOverrides(value={@javax.persistence.AssociationOverride(name="STRING")})
    String field;

}