package net.notgandhi.blog;

import javax.persistence.Embedded;
import java.util.Set;

/**
 * @path /posts/{@link Post#name}
 * @mixins mix:referenceable, mix:lockable, mix:lockable, mix:versionable
 *
 * @author dustin
 *
 */
public class Post implements AssetReferencer {
    /**
     * Name used to identify a {@link Post}. Although this will often be used as a title, much like the filename of a
     * document, it does not necessarily correlate 1:1 with a title.
     */
    String name;

    /**
     * List of {@link Content} that make up the majority of the {@link Post}. Each {@link Content} represents a
     * separate page of the {@link Post}.
     */
    @Embedded
    Contents contents;

    /**
     * Additional information that convey information about the {@link Post} itself.
     */
    MetaInfo metaInfo;

    /**
     *  Collection of authors who participated in the {@link Post}
     */
    @Embedded
    Users authors;

    /**
     * The principle {@link Asset} to be used when representing the {@link Post}
     */
    Asset principleAsset;

    @Override
    public Set<Asset> assetsReferenced() {
        Set<Asset> assetsReferenced = contents.assetsReferenced();
        assetsReferenced.add(principleAsset);

        return assetsReferenced;
    }
}
