/*
 * Copyright
 */

package net.notgandhi.blog.metadata;

import javax.persistence.Transient;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Metadata representing a MIME Type
 *
 * @author Dustin Sweigart <dustin@swigg.net>
 */
public class MediaType extends AbstractMetadata<String> {
    public static final String KEY = "media-type";

    protected String value;

    /**
     * No-arg Constructor
     */
    protected MediaType() {
    }

    public MediaType(com.google.common.net.MediaType mediaType) {
        this.setValue(checkNotNull(mediaType).toString());
    }

    public MediaType(String mediaType) {
        this(com.google.common.net.MediaType.parse(mediaType));
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Transient
    public com.google.common.net.MediaType getMediaType() {
        try {
            return com.google.common.net.MediaType.parse(this.getValue());
        } catch (IllegalArgumentException exception) {
            // eat the exception
        }

        return null;
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
