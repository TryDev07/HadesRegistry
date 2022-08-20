package nl.tritewolf.hadesregistry.registry;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class RegistryContainer {

    private final Set<RegistryProvider> items = new HashSet<>();

    public void add(@NotNull RegistryProvider item) {
        items.add(item);
    }

    public Set<RegistryProvider> getItems() {
        return items;
    }
}
