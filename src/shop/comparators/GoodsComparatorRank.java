package shop.comparators;

import shop.Goods;

import java.util.Comparator;

/**
 * Created by home pc on 21.06.2017.
 */
public class GoodsComparatorRank implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        if (o1.getRank() != o2.getRank()) {
            return o1.getRank() - o2.getRank();
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}


