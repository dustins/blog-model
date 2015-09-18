package net.notgandhi.blog;

import javax.persistence.Embeddable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author dustin
 */
@Embeddable
public class Contents extends ListWrapper<Content> implements Content {
    @Override
    public String getFullTextForQueries() {
        return this.stream()
                .map(Content::getFullTextForQueries)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public Set<Asset> assetsReferenced() {
        return this.stream().map(Content::assetsReferenced).reduce(new HashSet<>(), (a, b) -> {
            a.addAll(b);
            return a;
        });
    }
}
