package io.toolisticon.byoct.jpa.columnprocessor.testmethod;

import javax.persistence.Column;

public class TestcaseValidUsage {

    @Column()
    String method( String parameter) {
        return null;
    }

}