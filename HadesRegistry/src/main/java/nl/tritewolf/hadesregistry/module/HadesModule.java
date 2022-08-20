package nl.tritewolf.hadesregistry.module;

import dagger.Module;
import dagger.Provides;
import nl.tritewolf.hadesregistry.registry.RegistryContainer;
import nl.tritewolf.hadesregistry.registry.RegistryProcessor;

import javax.inject.Singleton;

@Module
public class HadesModule {

    @Provides
    @Singleton
    public RegistryContainer provideRegistryContainer() {
        return new RegistryContainer();
    }

    @Provides
    @Singleton
    public RegistryProcessor provideRegistryProcessor(RegistryContainer registryContainer) {
        return new RegistryProcessor(registryContainer);
    }
}
