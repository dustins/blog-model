package net.notgandhi.blog;

import javax.persistence.Embeddable;
import java.util.Optional;

/**
 * @author dustin
 */
@Embeddable
public class Localization {
    /**
     * Two character language representation according to ISO 639-1
     */
    private String language;

    /**
     * Two character language variety
     */
    private Optional<String> variety;
}
