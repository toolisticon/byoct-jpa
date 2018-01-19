package io.toolisticon.byoct.jpa.converterprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;
import javax.persistence.Converter;
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
 * Annotation processor for {@link Converter}.
 */
@OutOfService
@Service(Processor.class)
public class ConverterProcessor extends AbstractAnnotationProcessor {


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return createSupportedAnnotationSet(
                Converter.class
        );
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element : roundEnv.getElementsAnnotatedWith(Converter.class)) {

            // Add your own validation code here

        }

        return false;
    }
}
