package io.toolisticon.byoct.jpa.uniqueconstraintprocessor;

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
 * Tests of {@link UniqueConstraintProcessor}.
 */
@RunWith(Parameterized.class)
public class UniqueConstraintProcessorTest extends AbstractAnnotationProcessorIntegrationTest<UniqueConstraintProcessor> {


    public UniqueConstraintProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        UniqueConstraintProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected UniqueConstraintProcessor getAnnotationProcessor() {
        return new UniqueConstraintProcessor();
    }

    @Parameterized.Parameters(name = "{index}: \"{0}\"")
    public static List<Object[]> data() {

        return Arrays.asList(new Object[][]{

                

        });

    }


    @Test
    @Ignore
    public void testCorrectnessOfAdviceArgumentAnnotation() {
        super.test();
    }


}