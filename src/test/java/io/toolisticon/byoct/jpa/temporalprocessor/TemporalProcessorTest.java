package io.toolisticon.byoct.jpa.temporalprocessor;

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
 * Tests of {@link TemporalProcessor}.
 */
@RunWith(Parameterized.class)
public class TemporalProcessorTest extends AbstractAnnotationProcessorIntegrationTest<TemporalProcessor> {


    public TemporalProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        TemporalProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected TemporalProcessor getAnnotationProcessor() {
        return new TemporalProcessor();
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
                                .setSourceFileToCompile("testcases/temporalprocessor/method/testmethod/TestcaseValidUsage.java")
                                .compilationShouldSucceed()
                                .build()
                },

                
                // --------------------------------------------------------------
                // -- field : testfield
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/temporalprocessor/field/testfield/TestcaseValidUsage.java")
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