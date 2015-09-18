package net.notgandhi.blog;

import javax.persistence.Embeddable;

/**
 * @author dustin
 */
@Embeddable
public class Title {
    /**
     * The title of the returned story. This is the main title or headline.
     */
    private String title;

    /**
     * A short, sentence-like description of the returned story.
     */
    private String subtitle;

    /**
     * An abbreviated title for the returned story, not to exceed 30 characters.
     */
    private String shortTitle;
}
