package nl.tritewolf.hadesregistry.tests;

import nl.tritewolf.hadesregistry.HadesRegistry;
import nl.tritewolf.hadesregistry.tests.providers.TestProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class HadesRegistryTests {

    private static HadesRegistry hadesRegistry;

    @BeforeAll
    static void setup() {
        Logger.getAnonymousLogger().info("Starting testing:");
    }

    @Test
    public void testProcessor() {
        hadesRegistry = new HadesRegistry();
        hadesRegistry.add(new TestProvider());
        hadesRegistry.process();
    }


}
