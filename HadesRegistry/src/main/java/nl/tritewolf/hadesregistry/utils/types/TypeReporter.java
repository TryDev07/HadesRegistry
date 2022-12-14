package nl.tritewolf.hadesregistry.utils.types;

import java.lang.annotation.Annotation;

public interface TypeReporter extends Reporter {

    void reportTypeAnnotation(Class<? extends Annotation> annotation, String className);
}