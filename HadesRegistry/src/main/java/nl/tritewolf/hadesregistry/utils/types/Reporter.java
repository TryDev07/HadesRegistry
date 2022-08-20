package nl.tritewolf.hadesregistry.utils.types;

import java.lang.annotation.Annotation;

public interface Reporter {

    Class<? extends Annotation>[] annotations();
}