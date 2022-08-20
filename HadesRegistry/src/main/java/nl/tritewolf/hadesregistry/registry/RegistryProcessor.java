package nl.tritewolf.hadesregistry.registry;

import nl.tritewolf.hadesregistry.HadesRegistry;
import nl.tritewolf.hadesregistry.utils.AnnotationDetector;
import nl.tritewolf.hadesregistry.utils.types.TypeReporter;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class RegistryProcessor {

    private final RegistryContainer registryContainer;

    @Inject
    public RegistryProcessor(RegistryContainer registryContainer) {
        this.registryContainer = registryContainer;
    }

    public void process() {
        System.out.println(this.registryContainer.getItems());
        this.registryContainer.getItems().forEach(registryProvider -> {
            try {
                AnnotationDetector annotationDetector = new AnnotationDetector(getReporter(registryProvider));
                ClassLoader classLoader = this.getClass().getClassLoader();
                String[] objects = Arrays.stream(Package.getPackages()).map(Package::getName).toArray(String[]::new);
                System.out.println(Arrays.asList(objects));
                annotationDetector.detect(classLoader, objects);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


    }

    @NotNull
    private TypeReporter getReporter(RegistryProvider registryProvider) {
        return new TypeReporter() {
            @Override
            public void reportTypeAnnotation(Class<? extends Annotation> annotation, String className) {
                try {
                    Class<?> clazz = Class.forName(className);
                    registryProvider.handle(clazz, annotation);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public Class<? extends Annotation>[] annotations() {
                return registryProvider.annotations();
            }
        };
    }
}
