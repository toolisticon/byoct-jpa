package io.toolisticon.byoct.jpa.entityprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;
import io.toolisticon.annotationprocessortoolkit.tools.MessagerUtils;
import io.toolisticon.annotationprocessortoolkit.tools.corematcher.CoreMatchers;
import io.toolisticon.annotationprocessortoolkit.tools.fluentvalidator.FluentElementValidator;
import io.toolisticon.byoct.jpa.CommonConstants;
import io.toolisticon.spiap.api.Service;

import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.persistence.Entity;
import java.util.Set;

/**
 * Annotation processor for {@link Entity}.
 */
@Service(Processor.class)
public class EntityProcessor extends AbstractAnnotationProcessor {


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return createSupportedAnnotationSet(
                Entity.class
        );
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element : roundEnv.getElementsAnnotatedWith(Entity.class)) {

            // annotation must be applied to class
            FluentElementValidator.createFluentElementValidator(element).is(CoreMatchers.IS_CLASS).validateAndIssueMessages();

            Entity entityAnnotation = element.getAnnotation(Entity.class);

            // reserved literal in the Java Persistence query language
            if (!entityAnnotation.name().isEmpty()) {
                String uppercaseName = entityAnnotation.name().toUpperCase();
                for (String reservedIdentifier : CommonConstants.UPPERCASED_RESERVED_IDENTIFIERS) {
                    if (reservedIdentifier.equals(uppercaseName)) {
                        MessagerUtils.error(element, EntityProcessorMessages.ERROR_NAME_MUST_NOT_BE_RESERVED_IDENTIFIER.getMessage(), entityAnnotation.name());
                    }
                }
            }

        }

        return false;
    }
}
