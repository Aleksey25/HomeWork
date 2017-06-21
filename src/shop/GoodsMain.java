package shop;


import shop.comparators.GoodsComparatorName;
import shop.comparators.GoodsComparatorPrice;
import shop.comparators.GoodsComparatorRank;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by belkin on 16.06.2017.
 */
public class GoodsMain {
    public static void main(String[] args) {
        GoodsComparatorRank goodsComparatorRank = new GoodsComparatorRank();
        GoodsComparatorPrice goodsComparatorPrice = new GoodsComparatorPrice();
        GoodsComparatorName goodsComparatorName = new GoodsComparatorName();

        TreeSet<Goods> aplTshort = new TreeSet<Goods>(goodsComparatorPrice);

        aplTshort.add(new Goods("Manchester United", 550, 2));
        aplTshort.add(new Goods("Arsenal", 440, 4));
        aplTshort.add(new Goods("Chelsea", 560, 1));
        aplTshort.add(new Goods("Manchester City", 450, 3));
        aplTshort.add(new Goods("Liverpool", 540, 3));
        aplTshort.add(new Goods("Tottenham", 500, 2));
        Category apltshorts = new Category("APL T-Shorts", aplTshort);
        printGoods(apltshorts);


        /*TreeSet<Goods> aplTshort = new TreeSet<Goods>(goodsComparatorPrice);
        TreeSet<Goods> aplTshort = new TreeSet<Goods>(goodsComparatorRank);*/
    }



    public static void printGoods(Category category) {
        Iterator<Goods> iterator = category.getGoodsSet().iterator();
        while (iterator.hasNext()) {
            System.out.print(category.getName() + " ");
            System.out.println(iterator.next());
        }
        System.out.println();
    }
        

}