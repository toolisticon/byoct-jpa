package io.toolisticon.byoct.jpa.persistencecontextprocessor.testmethod;

import javax.persistence.PersistenceContext;

public class TestcaseValidUsage {

    @PersistenceContext()
    String method( String parameter) {
        return null;
    }

}