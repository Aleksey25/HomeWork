package shop;

import java.util.SortedSet;

/**
 * Created by belkin on 16.06.2017.
 */
public class Category {
    private String name;
    private SortedSet<Goods> goodsSet;

    public Category(String name, SortedSet<Goods> goodsSet) {
        this.name = name;
        this.goodsSet = goodsSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(SortedSet<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

}
