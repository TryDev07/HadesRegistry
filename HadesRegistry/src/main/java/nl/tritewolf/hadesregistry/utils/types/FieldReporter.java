package nl.tritewolf.hadesregistry.utils.types;

import java.lang.annotation.Annotation;

public interface FieldReporter extends Reporter {

    void reportFieldAnnotation(Class<? extends Annotation> annotation, String className,
                               String fieldName);

}