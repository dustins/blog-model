package net.notgandhi.blog;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author dustin
 */
public class User implements AssetReferencer {
    String name;

    String displayName;

    String email;

    Credentials credentials;

    /**
     * The principle {@link Asset} to be used when representing the {@link User}
     */
    Asset principleAsset;

    @Override
    public Set<Asset> assetsReferenced() {
        return ImmutableSet.of(principleAsset);
    }
}
