/*
 * Copyright
 */

package net.notgandhi.blog.metadata;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Metadata representing the size of a file in bytes
 *
 * @author Dustin Sweigart <dustin@swigg.net>
 */
public class Size extends AbstractMetadata<Long> {
    public static final String KEY = "size";

    protected Long value;

    /**
     * No-arg Constructor
     */
    protected Size() {
    }

    public Size(Long size) {
        checkArgument(size >= checkNotNull(size), "Argument `size` must represent a size greater or equal to 0 bytes.");
        this.setValue(size);
    }

    @Override
    public Long getValue() {
        return this.value;
    }

    @Override
    public void setValue(Long value) {
        this.value = value;
    }

    public Long getSize() {
        return getValue();
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public boolean isUnique() {
        return true;
    }
}
