package net.notgandhi.blog;

import java.util.Collections;
import java.util.Set;

/**
 * @author dustin
 */
public class TextContent implements Content {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getFullTextForQueries() {
        return text;
    }

    @Override
    public Set<Asset> assetsReferenced() {
        return Collections.emptySet();
    }
}
