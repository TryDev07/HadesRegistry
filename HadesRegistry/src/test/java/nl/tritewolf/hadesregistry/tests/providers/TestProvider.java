package nl.tritewolf.hadesregistry.tests.providers;

import nl.tritewolf.hadesregistry.registry.RegistryProvider;
import nl.tritewolf.hadesregistry.tests.annotations.TestAnnotation;

import java.lang.annotation.Annotation;

public class TestProvider implements RegistryProvider {

    @Override
    public Class<? extends Annotation>[] annotations() {
        return new Class[]{TestAnnotation.class};
    }

    @Override
    public void handle(Class<?> clazz, Class<? extends Annotation> type) {
        System.out.println("TestProvider.handle: " + clazz.getName() + " " + type.getName());
    }
}
