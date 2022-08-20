package nl.tritewolf.hadesregistry.components;

import dagger.Component;
import nl.tritewolf.hadesregistry.HadesRegistry;
import nl.tritewolf.hadesregistry.module.HadesModule;
import nl.tritewolf.hadesregistry.registry.RegistryProcessor;

import javax.inject.Singleton;

@Singleton
@Component(modules = HadesModule.class)
public interface HadesComponent {

    HadesRegistry buildHadesRegistry();

    RegistryProcessor registryProcessor();
}
