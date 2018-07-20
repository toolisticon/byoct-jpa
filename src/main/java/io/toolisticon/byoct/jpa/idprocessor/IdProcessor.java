package io.toolisticon.byoct.jpa.idprocessor;

import io.toolisticon.annotationprocessortoolkit.AbstractAnnotationProcessor;
import io.toolisticon.annotationprocessortoolkit.tools.ElementUtils;
import io.toolisticon.annotationprocessortoolkit.tools.MessagerUtils;
import io.toolisticon.annotationprocessortoolkit.tools.TypeUtils;
import io.toolisticon.annotationprocessortoolkit.tools.corematcher.CoreMatchers;
import io.toolisticon.annotationprocessortoolkit.tools.fluentvalidator.FluentElementValidator;
import io.toolisticon.spiap.api.OutOfService;
import io.toolisticon.spiap.api.Service;

import javax.annotation.processing.Messager;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

/**
 * Annotation processor for {@link Id}.
 */
@Service(Processor.class)
public class IdProcessor extends AbstractAnnotationProcessor {


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return createSupportedAnnotationSet(
                Id.class
        );
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element : roundEnv.getElementsAnnotatedWith(Id.class)) {

            TypeMirror typeToCheck = null;

            // Add your own validation code here
            if (FluentElementValidator.createFluentElementValidator(element)
                    .is(CoreMatchers.IS_METHOD).justValidate()
                    && FluentElementValidator.createFluentElementValidator(element)
                    .is(CoreMatchers.IS_METHOD)
                    .applyValidator(CoreMatchers.IS_GETTER_METHOD)
                    .validateAndIssueMessages()) {

                // check property
                ExecutableElement executableElement = ElementUtils.CastElement.castToExecutableElement(element);

                typeToCheck = executableElement.getReturnType();


            } else if (CoreMatchers.BY_ELEMENT_KIND.getMatcher().checkForMatchingCharacteristic(element, ElementKind.FIELD)) {

                typeToCheck = element.asType();

            } else {
                MessagerUtils.error(element,"Id annotation must either be placed on field or getter method");
            }

            // Now check validity of type
            // from SPEC:
            // Specifies the primary key of an entity. The field or property to which the Id annotation is applied should be one of the following types:
            // any Java primitive type; any primitive wrapper type; String; java.util.Date; java.sql.Date; java.math.BigDecimal; java.math.BigInteger.
            
            boolean isPrimitive = TypeUtils.CheckTypeKind.isPrimitive(typeToCheck);
            boolean isString = TypeUtils.TypeComparison.isTypeEqual(typeToCheck, String.class);
            boolean isJavaUtilDate = TypeUtils.TypeComparison.isTypeEqual(typeToCheck, java.util.Date.class);
            boolean isSqlDate = TypeUtils.TypeComparison.isTypeEqual(typeToCheck, java.sql.Date.class);
            boolean isBigDecimalOrBigInteger = TypeUtils.TypeComparison.isTypeEqual(typeToCheck, BigDecimal.class) || TypeUtils.TypeComparison.isTypeEqual(typeToCheck, BigInteger.class);

            if (!(isPrimitive ||isString || isJavaUtilDate || isSqlDate || isBigDecimalOrBigInteger)) {
                MessagerUtils.error( element,"Annotated Id type is '" + typeToCheck.toString() + "' but should be one of the following types: any Java primitive type; any primitive wrapper type; String; java.util.Date; java.sql.Date; java.math.BigDecimal; java.math.BigInteger");
            }



        }

        return false;
    }
}
