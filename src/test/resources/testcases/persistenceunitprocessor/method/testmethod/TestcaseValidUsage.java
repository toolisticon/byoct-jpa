package io.toolisticon.byoct.jpa.persistenceunitprocessor.testmethod;

import javax.persistence.PersistenceUnit;

public class TestcaseValidUsage {

    @PersistenceUnit()
    String method( String parameter) {
        return null;
    }

}