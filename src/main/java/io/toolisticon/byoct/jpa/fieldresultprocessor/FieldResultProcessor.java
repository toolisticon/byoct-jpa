package io.toolisticon.byoct.jpa.fieldresultprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;
import javax.persistence.FieldResult;
import io.toolisticon.spiap.api.Service;
import io.toolisticon.spiap.api.OutOfService;

import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.StandardLocation;
import java.util.Set;

/**
 * Annotation processor for {@link FieldResult}.
 */
@OutOfService
@Service(Processor.class)
public class FieldResultProcessor extends AbstractAnnotationProcessor {


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return createSupportedAnnotationSet(
                FieldResult.class
        );
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element : roundEnv.getElementsAnnotatedWith(FieldResult.class)) {

            // Add your own validation code here

        }

        return false;
    }
}
