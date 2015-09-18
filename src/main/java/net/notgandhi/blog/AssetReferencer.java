package net.notgandhi.blog;

import java.util.Set;

/**
 * @author dustin
 */
public interface AssetReferencer {
    /**
     * The {@link Set} of all {@link Asset}s referenced by implementing classes.
     */
    Set<Asset> assetsReferenced();
}
