/*
 * Copyright
 */

package net.notgandhi.blog.metadata;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.emptyToNull;

/**
 * Metadata representing the filename
 *
 * @author Dustin Sweigart <dustin@swigg.net>
 */
public class Filename extends AbstractMetadata<String> {
    public static final String KEY = "filename";

    protected String value;

    /**
     * No-arg Constructor
     */
    protected Filename() {
    }

    public Filename(String filename) {
        this.setValue(checkNotNull(emptyToNull(filename)));
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    public String getFilename() {
        return this.getValue();
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
