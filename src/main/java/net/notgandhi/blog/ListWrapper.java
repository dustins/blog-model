package net.notgandhi.blog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dustin
 */
public class ListWrapper<T> extends CollectionWrapper<T, List<T>> {
    public ListWrapper() {
        super(new ArrayList<>());
    }
}
