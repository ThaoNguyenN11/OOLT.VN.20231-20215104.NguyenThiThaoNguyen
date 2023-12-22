package hust.soict.hedspi.aims.media.comparators;
import java.util.Comparator;
import java.util.Comparator;

import hust.soict.hedspi.aims.media.Media;
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media a, Media b) {
        return Comparator.comparing(Media::getTitle)
                .thenComparingDouble((o) -> - o.getCost())
                .compare(a, b);
    }
}
