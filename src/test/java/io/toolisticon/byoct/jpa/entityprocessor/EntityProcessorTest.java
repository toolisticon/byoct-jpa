package io.toolisticon.byoct.jpa.entityprocessor;

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
 * Tests of {@link EntityProcessor}.
 */
@RunWith(Parameterized.class)
public class EntityProcessorTest extends AbstractAnnotationProcessorIntegrationTest<EntityProcessor> {


    public EntityProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        EntityProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected EntityProcessor getAnnotationProcessor() {
        return new EntityProcessor();
    }

    @Parameterized.Parameters(name = "{index}: \"{0}\"")
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{

                
                // --------------------------------------------------------------
                // -- type : testinterface
                // --------------------------------------------------------------

                {
                        "Test : compilation must fail if annotation is placed on interface",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/entityprocessor/type/testinterface/TestcaseInvalidUsage.java")
                                .compilationShouldFail()
                                .build()
                },

                
                // --------------------------------------------------------------
                // -- type : testenum
                // --------------------------------------------------------------

                {
                        "Test : compilation must fail if annotation is placed on enum",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/entityprocessor/type/testenum/TestcaseInvalidUsage.java")
                                .compilationShouldFail()
                                .build()
                },

                
                // --------------------------------------------------------------
                // -- type : testclass
                // --------------------------------------------------------------

                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/entityprocessor/type/testclass/TestcaseValidUsage.java")
                                .compilationShouldSucceed()
                                .build()
                },
                {
                        "Test valid usage with valid name",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/entityprocessor/type/testclass/TestcaseValidUsageWithValidName.java")
                                .compilationShouldSucceed()
                                .build()
                },
                {
                        "Test valid usage",
                        AnnotationProcessorIntegrationTestConfigurationBuilder
                                .createTestConfig()
                                .setSourceFileToCompile("testcases/entityprocessor/type/testclass/TestcaseInvalidUsageNameIsReservedIdentifier.java")
                                .addMessageValidator()
                                .setErrorChecks(EntityProcessorMessages.ERROR_NAME_MUST_NOT_BE_RESERVED_IDENTIFIER.getCode())
                                .finishMessageValidator()
                                .compilationShouldFail()
                                .build()
                },

                

        });

    }


    @Test
    public void testCorrectnessOfAdviceArgumentAnnotation() {
        super.test();
    }


}