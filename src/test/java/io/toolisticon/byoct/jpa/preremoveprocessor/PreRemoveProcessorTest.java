package io.toolisticon.byoct.jpa.preremoveprocessor;

import io.toolisticon.annotationprocessortoolkit.testhelper.AbstractAnnotationProcessorIntegrationTest;
import io.toolisticon.annotationprocessortoolkit.testhelper.integrationtest.AnnotationProcessorIntegrationTestConfiguration;
import io.toolisticon.annotationprocessortoolkit.testhelper.integrationtest.AnnotationProcessorIntegrationTestConfigurationBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;

/**
 * Tests of {@link PreRemoveProcessor}.
 */
@RunWith(Parameterized.class)
public class PreRemoveProcessorTest extends AbstractAnnotationProcessorIntegrationTest<PreRemoveProcessor> {


    public PreRemoveProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        PreRemoveProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected PreRemoveProcessor getAnnotationProcessor() {
        return new PreRemoveProcessor();
    }

    @Parameterized.Parameters(name = "{index}: \"{0}\"")
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{

                
                // --------------------------------------------------------------
                // -- method : testmethod
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/preremoveprocessor/method/testmethod/TestcaseValidUsage.java")
                                .compilationShouldSucceed()
                                .build()
                },

                

        });

    }


    @Test
    @Ignore
    public void testCorrectnessOfAdviceArgumentAnnotation() {
        super.test();
    }


}