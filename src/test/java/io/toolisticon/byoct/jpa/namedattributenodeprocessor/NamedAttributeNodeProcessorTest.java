package io.toolisticon.byoct.jpa.namedattributenodeprocessor;

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
 * Tests of {@link NamedAttributeNodeProcessor}.
 */
@RunWith(Parameterized.class)
public class NamedAttributeNodeProcessorTest extends AbstractAnnotationProcessorIntegrationTest<NamedAttributeNodeProcessor> {


    public NamedAttributeNodeProcessorTest(String description, AnnotationProcessorIntegrationTestConfiguration configuration) {
        super(configuration);
    }

    @Before
    public void init() {
        NamedAttributeNodeProcessorMessages.setPrintMessageCodes(true);
    }

    @Override
    protected NamedAttributeNodeProcessor getAnnotationProcessor() {
        return new NamedAttributeNodeProcessor();
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