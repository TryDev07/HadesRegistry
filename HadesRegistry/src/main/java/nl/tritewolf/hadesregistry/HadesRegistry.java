package nl.tritewolf.hadesregistry;

import nl.tritewolf.hadesregistry.registry.RegistryContainer;
import nl.tritewolf.hadesregistry.registry.RegistryProcessor;
import nl.tritewolf.hadesregistry.registry.RegistryProvider;

public class HadesRegistry {

    private final RegistryContainer registryContainer;
    private final RegistryProcessor registryProcessor;

    public HadesRegistry() {
        this.registryContainer = new RegistryContainer();
        this.registryProcessor = new RegistryProcessor(this.registryContainer);
    }

    public void add(RegistryProvider registryProvider) {
        registryContainer.add(registryProvider);
    }

    public void process() {
        registryProcessor.process();
    }
}
