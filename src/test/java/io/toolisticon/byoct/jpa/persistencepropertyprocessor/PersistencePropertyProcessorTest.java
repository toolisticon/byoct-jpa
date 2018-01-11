package io.toolisticon.byoct.jpa.persistencepropertyprocessor;

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
 * Tests of {@link PersistencePropertyProcessor}.
 */
@RunWith(Parameterized.class)
public class PersistencePropertyProcessorTest extends AbstractAnnotationProcessorIntegrationTest<PersistencePropertyProcessor> {


    public PersistencePropertyProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        PersistencePropertyProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected PersistencePropertyProcessor getAnnotationProcessor() {
        return new PersistencePropertyProcessor();
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