package net.notgandhi.blog;

import javax.persistence.Embedded;
import java.net.URI;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * @author dustin
 */
public class Publication {
    /**
     * The {@link URI} where to view the source of this {@link Publication}'s information
     */
    URI sourceUri;

    /**
     * The {@link URI} where to view this {@link Publication}.
     */
    Optional<URI> publicationUri;

    /**
     * Title information used for the {@link Publication}.
     */
    @Embedded
    Title title;

    /**
     * Description information used for the {@link Publication}.
     */
    @Embedded
    Description description;

    /**
     * When the {@link Publication} was published
     */
    Date published;

    /**
     * A collection of terms used for searching.
     */
    Set<String> keywords;
}
