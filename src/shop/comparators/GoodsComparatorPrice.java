package shop.comparators;

import shop.Goods;

import java.util.Comparator;

/**
 * Created by home pc on 21.06.2017.
 */
public class GoodsComparatorPrice implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
