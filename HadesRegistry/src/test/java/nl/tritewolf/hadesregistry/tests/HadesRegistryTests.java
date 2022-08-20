package nl.tritewolf.hadesregistry.tests;

import nl.tritewolf.hadesregistry.HadesRegistry;
import nl.tritewolf.hadesregistry.components.DaggerHadesComponent;
import nl.tritewolf.hadesregistry.components.HadesComponent;
import nl.tritewolf.hadesregistry.registry.RegistryProcessor;
import nl.tritewolf.hadesregistry.tests.providers.TestProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class HadesRegistryTests {

    private static HadesRegistry hadesRegistry;

    @BeforeAll
    static void setup() {
//        hadesRegistry = new HadesRegistry();
        Logger.getAnonymousLogger().info("Starting testing:");
    }

    @Test
    public void testProcessor() {
        HadesComponent hadesComponent = DaggerHadesComponent.create();
        HadesRegistry hadesRegistry = hadesComponent.buildHadesRegistry();

        hadesRegistry.add(new TestProvider());
        hadesRegistry.process();
    }


}
