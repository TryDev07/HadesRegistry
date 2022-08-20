package nl.tritewolf.hadesregistry.registry;

import java.lang.annotation.Annotation;

public interface RegistryProvider {

    Class<? extends Annotation>[] annotations();

    void handle(Class<?> clazz, Class<? extends Annotation> type);
}
