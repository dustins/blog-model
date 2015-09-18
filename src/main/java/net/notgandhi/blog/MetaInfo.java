package net.notgandhi.blog;

import javax.persistence.Embedded;
import java.util.Date;
import java.util.Set;

/**
 * @author dustin
 */
public class MetaInfo {
    /**
     * When the owning object was created.
     */
    Date created;

    /**
     * A textual description of who created the owning object. This should be something friendly for display as a
     * more durable record will be recorded by the version system when necessary.
     */
    String createdBy;

    /**
     * When the owning object was last modified.
     */
    Date lastModified;

    /**
     * A textual description of who last modified the owning object. This should be something friendly for display as a
     * more durable record will be recorded by the version system when necessary.
     */
    String lastModifiedBy;

    /**
     * A collection of shared labels used for loose categorisation.
     */
    @Embedded
    Tags tags;

    /**
     * A collection of terms used for searching.
     */
    Set<String> keywords;

    /**
     * Relevant localization information.
     */
    @Embedded
    Localization localization;
}
