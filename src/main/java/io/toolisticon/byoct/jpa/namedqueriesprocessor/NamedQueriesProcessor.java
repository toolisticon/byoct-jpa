package io.toolisticon.byoct.jpa.namedqueriesprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;
import javax.persistence.NamedQueries;
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
 * Annotation processor for {@link NamedQueries}.
 */
@OutOfService
@Service(Processor.class)
public class NamedQueriesProcessor extends AbstractAnnotationProcessor {


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return createSupportedAnnotationSet(
                NamedQueries.class
        );
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element : roundEnv.getElementsAnnotatedWith(NamedQueries.class)) {

            // Add your own validation code here

        }

        return false;
    }
}
