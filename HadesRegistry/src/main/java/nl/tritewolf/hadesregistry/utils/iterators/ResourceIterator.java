package nl.tritewolf.hadesregistry.utils.iterators;

import java.io.IOException;
import java.io.InputStream;

public abstract class ResourceIterator {

    public abstract InputStream next() throws IOException;

}
