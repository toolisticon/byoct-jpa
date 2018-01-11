package io.toolisticon.byoct.jpa.versionprocessor.testmethod;

import javax.persistence.Version;

public class TestcaseValidUsage {

    @Version()
    String method( String parameter) {
        return null;
    }

}