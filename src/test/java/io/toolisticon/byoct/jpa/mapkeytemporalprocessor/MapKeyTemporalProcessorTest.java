package io.toolisticon.byoct.jpa.mapkeytemporalprocessor;

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
 * Tests of {@link MapKeyTemporalProcessor}.
 */
@RunWith(Parameterized.class)
public class MapKeyTemporalProcessorTest extends AbstractAnnotationProcessorIntegrationTest<MapKeyTemporalProcessor> {


    public MapKeyTemporalProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        MapKeyTemporalProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected MapKeyTemporalProcessor getAnnotationProcessor() {
        return new MapKeyTemporalProcessor();
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
                                .setSourceFileToCompile("testcases/mapkeytemporalprocessor/method/testmethod/TestcaseValidUsage.java")
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
                                .setSourceFileToCompile("testcases/mapkeytemporalprocessor/field/testfield/TestcaseValidUsage.java")
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