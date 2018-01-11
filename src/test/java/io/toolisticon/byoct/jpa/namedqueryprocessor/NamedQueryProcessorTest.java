package io.toolisticon.byoct.jpa.namedqueryprocessor;

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
 * Tests of {@link NamedQueryProcessor}.
 */
@RunWith(Parameterized.class)
public class NamedQueryProcessorTest extends AbstractAnnotationProcessorIntegrationTest<NamedQueryProcessor> {


    public NamedQueryProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        NamedQueryProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected NamedQueryProcessor getAnnotationProcessor() {
        return new NamedQueryProcessor();
    }

    @Parameterized.Parameters(name = "{index}: \"{0}\"")
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{

                
                // --------------------------------------------------------------
                // -- type : testinterface
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/namedqueryprocessor/type/testinterface/TestcaseValidUsage.java")
                                .compilationShouldSucceed()
                                .build()
                },

                
                // --------------------------------------------------------------
                // -- type : testenum
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/namedqueryprocessor/type/testenum/TestcaseValidUsage.java")
                                .compilationShouldSucceed()
                                .build()
                },

                
                // --------------------------------------------------------------
                // -- type : testclass
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/namedqueryprocessor/type/testclass/TestcaseValidUsage.java")
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