package net.notgandhi.blog;

import net.notgandhi.blog.metadata.Metadata;

import javax.jcr.Binary;

/**
 * @author dustin
 */
public class Asset {
    /**
     * Collection of {@link Metadata} associated with this {@link Asset}
     */
    AssetMetadata metadata;

    /**
     * Additional information that convey information about the {@link Asset}
     */
    MetaInfo metaInfo;

    /**
     * Data representing the {@link Asset}
     */
    Binary data;

    /**
     * Derivative {@link Asset}s
     */
    Assets derivatives;
}
