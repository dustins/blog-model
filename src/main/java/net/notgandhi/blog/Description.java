package net.notgandhi.blog;

import javax.persistence.Embeddable;

/**
 * @author dustin
 */
@Embeddable
public class Description {
    /**
     * A brief description.
     */
    String teaser;

    /**
     * A shorter description.
     */
    String miniTeaser;

    public Description(String teaser) {
        this(teaser, teaser);
    }

    /**
     * designated constructor
     *
     * @param teaser
     * @param miniTeaser
     */
    public Description(String teaser, String miniTeaser) {
        this.teaser = teaser;
        this.miniTeaser = miniTeaser;
    }

    public String getTeaser() {
        return teaser;
    }

    public String getMiniTeaser() {
        return miniTeaser;
    }
}
