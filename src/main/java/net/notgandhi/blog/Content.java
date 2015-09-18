package net.notgandhi.blog;

/**
 * @mixins mix:versionable
 *
 * @author dustin
 */
public interface Content extends AssetReferencer {
    /**
     * Provides a textual representation that can be used for general full text searches
     */
    String getFullTextForQueries();
}
