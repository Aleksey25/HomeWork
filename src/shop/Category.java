package shop;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by belkin on 16.06.2017.
 */
public class Category {
    private String name;
    private TreeSet<Goods> GoodsSet;

    public Category(String name, TreeSet<Goods> goodsSet) {
        this.name = name;
        GoodsSet = goodsSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Goods> getGoodsSet() {
        return GoodsSet;
    }

    public void setGoodsSet(TreeSet<Goods> goodsSet) {
        GoodsSet = goodsSet;
    }

}
