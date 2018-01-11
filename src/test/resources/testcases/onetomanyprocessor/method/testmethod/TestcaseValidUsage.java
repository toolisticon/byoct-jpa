package io.toolisticon.byoct.jpa.onetomanyprocessor.testmethod;

import javax.persistence.OneToMany;

public class TestcaseValidUsage {

    @OneToMany()
    String method( String parameter) {
        return null;
    }

}