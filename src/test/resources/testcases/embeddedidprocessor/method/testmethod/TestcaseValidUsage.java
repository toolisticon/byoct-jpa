package io.toolisticon.byoct.jpa.embeddedidprocessor.testmethod;

import javax.persistence.EmbeddedId;

public class TestcaseValidUsage {

    @EmbeddedId()
    String method( String parameter) {
        return null;
    }

}