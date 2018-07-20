package io.toolisticon.byoct.jpa.entityprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;

import javax.lang.model.element.ElementKind;
import javax.persistence.Entity;

import io.toolisticon.annotationprocessortoolkit.tools.characteristicsvalidator.Validators;
import io.toolisticon.annotationprocessortoolkit.validators.FluentElementValidator;
import io.toolisticon.byoct.jpa.CommonConstants;
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
            FluentElementValidator.createFluentElementValidator(element).applyValidator(Validators.ELEMENT_KIND_VALIDATOR).validateByOneOf(ElementKind.CLASS);

            Entity entityAnnotation = element.getAnnotation(Entity.class);

            // reserved literal in the Java Persistence query language
            if (!entityAnnotation.name().isEmpty()) {
                String uppercaseName = entityAnnotation.name().toUpperCase();
                for (String reservedIdentifier : CommonConstants.UPPERCASED_RESERVED_IDENTIFIERS) {
                    if (reservedIdentifier.equals(uppercaseName)) {
                        getMessager().error(element, EntityProcessorMessages.ERROR_NAME_MUST_NOT_BE_RESERVED_IDENTIFIER.getMessage(), entityAnnotation.name());
                    }
                }
            }

        }

        return false;
    }
}
