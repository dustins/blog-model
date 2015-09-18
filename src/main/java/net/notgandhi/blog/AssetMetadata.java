package net.notgandhi.blog;

import net.notgandhi.blog.metadata.AbstractMetadata;
import net.notgandhi.blog.metadata.Metadata;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AssetMetadata extends ListWrapper<Metadata> {
    @Override
    public boolean add(Metadata metadata) {
        if (metadata.isUnique()) {
            this.remove(metadata.getClass());
        }

        return super.add(metadata);
    }

    @Override
    public boolean addAll(Collection<? extends Metadata> c) {
        boolean modified = false;
        for (Metadata metadata : c) {
            if (metadata.isUnique()) {
                this.remove(metadata.getClass());
                modified = true;
            }
        }

        return modified || super.addAll(c);
    }

    @SuppressWarnings("unchecked")
    public <T extends AbstractMetadata> List<T> get(final Class<T> clazz) {
        return this.stream().filter(m -> clazz.isAssignableFrom(m.getClass())).map(m -> clazz.cast(m)).collect(Collectors.toList());
    }

    private Collection<Metadata> get(final String key) {
        return this.stream().filter(m -> m.getKey().equals(key)).collect(Collectors.toList());
    }

    public <T extends Metadata> boolean remove(final Class<T> clazz) {
        boolean modified = false;

        for (Metadata metadata : this) {
            if (clazz.isInstance(metadata)) {
                modified = modified || this.remove(metadata);

                if (metadata.isUnique()) {
                    break;
                }
            }
        }

        return modified;
    }

    private boolean remove(final String key) {
        for (Metadata metadata : this) {
            if (metadata.getKey().equals(key)) {
                return this.remove(metadata);
            }
        }

        return false;
    }
}
