package shop.comparators;

import shop.Goods;

import java.util.Comparator;

/**
 * Created by home pc on 21.06.2017.
 */
public class GoodsComparatorName implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
