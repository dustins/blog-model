package net.notgandhi.blog;

import java.util.Optional;

public class Credential {
    /**
     * Unique identifier for this {@link Credential}
     */
    private String identifier;

    /**
     * Optional challenge to validate ownership of this {@link Credential}
     */
    private Optional<String> challenge;
}
