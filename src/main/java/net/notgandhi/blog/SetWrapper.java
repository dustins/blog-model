package net.notgandhi.blog;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dustin
 */
public class SetWrapper<T> extends CollectionWrapper<T, Set<T>> {
    public SetWrapper() {
        super(new HashSet<>());
    }
}
