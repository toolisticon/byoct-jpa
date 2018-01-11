package io.toolisticon.byoct.jpa.storedprocedureparameterprocessor;

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
 * Tests of {@link StoredProcedureParameterProcessor}.
 */
@RunWith(Parameterized.class)
public class StoredProcedureParameterProcessorTest extends AbstractAnnotationProcessorIntegrationTest<StoredProcedureParameterProcessor> {


    public StoredProcedureParameterProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        StoredProcedureParameterProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected StoredProcedureParameterProcessor getAnnotationProcessor() {
        return new StoredProcedureParameterProcessor();
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