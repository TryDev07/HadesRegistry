package nl.tritewolf.hadesregistry;

import nl.tritewolf.hadesregistry.registry.RegistryContainer;
import nl.tritewolf.hadesregistry.registry.RegistryProcessor;
import nl.tritewolf.hadesregistry.registry.RegistryProvider;

import javax.inject.Inject;


public class HadesRegistry {

    private final RegistryContainer registryContainer;
    private final RegistryProcessor registryProcessor;

    @Inject
    public HadesRegistry(RegistryContainer registryContainer, RegistryProcessor registryProcessor) {
        this.registryContainer = registryContainer;
        this.registryProcessor = registryProcessor;
    }

    public void add(RegistryProvider registryProvider) {
        registryContainer.add(registryProvider);
    }

    public void process() {
        registryProcessor.process();
    }
}
