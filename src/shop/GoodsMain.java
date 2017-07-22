package shop;


import shop.comparators.GoodsComparatorName;
import shop.comparators.GoodsComparatorPrice;
import shop.comparators.GoodsComparatorRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by belkin on 16.06.2017.
 */
public class GoodsMain {
    public static void main(String[] args) {
        GoodsComparatorRank goodsComparatorRank = new GoodsComparatorRank();
        GoodsComparatorPrice goodsComparatorPrice = new GoodsComparatorPrice();
        GoodsComparatorName goodsComparatorName = new GoodsComparatorName();

        SortedSet<Goods> aplTshort = new TreeSet<Goods>(goodsComparatorPrice);
        aplTshort.add(new Goods("Manchester United", 550, 2));
        aplTshort.add(new Goods("Arsenal", 440, 4));
        aplTshort.add(new Goods("Chelsea", 560, 1));
        aplTshort.add(new Goods("Manchester City", 450, 3));
        aplTshort.add(new Goods("Liverpool", 540, 3));
        aplTshort.add(new Goods("Tottenham", 500, 2));
        Category apltshorts = new Category("APL T-Shorts", aplTshort);
        printGoods(apltshorts);

        ArrayList<Goods> aplTshortList = new ArrayList<Goods>(aplTshort);
        aplTshortList.sort(goodsComparatorPrice.reversed());
        System.out.println("Reverse order: ");
        System.out.println(aplTshortList);
        System.out.println();

        SortedSet<Goods> aplScarf = new TreeSet<Goods>(goodsComparatorName);
        aplScarf.add(new Goods("Manchester United", 55, 2));
        aplScarf.add(new Goods("Arsenal", 40, 4));
        aplScarf.add(new Goods("Chelsea", 60, 1));
        aplScarf.add(new Goods("Manchester City", 45, 3));
        aplScarf.add(new Goods("Liverpool", 50, 3));
        aplScarf.add(new Goods("Tottenham", 55, 2));
        Category aplScarfs = new Category("APL Scarfs", aplScarf);
        printGoods(aplScarfs);

        ArrayList<Goods> aplScarfsList = new ArrayList<Goods>(aplScarf);
        aplScarfsList.sort(goodsComparatorName.reversed());
        System.out.println("Reverse order: ");
        System.out.println(aplScarfsList);
        System.out.println();


        SortedSet<Goods> aplBall = new TreeSet<Goods>(goodsComparatorRank);
        aplBall.add(new Goods("Manchester United", 550, 2));
        aplBall.add(new Goods("Arsenal", 440, 4));
        aplBall.add(new Goods("Chelsea", 560, 1));
        aplBall.add(new Goods("Manchester City", 450, 3));
        aplBall.add(new Goods("Liverpool", 540, 3));
        aplBall.add(new Goods("Tottenham", 500, 2));
        Category aplBalls = new Category("APL Souvenir balls", aplBall);
        printGoods(aplBalls);
        ArrayList<Goods> aplBallsList = new ArrayList<Goods>(aplBall);
        aplBallsList.sort(goodsComparatorRank.reversed());
        System.out.println("Reverse order: ");
        System.out.println(aplBallsList);
        System.out.println();
    }

    public static void printGoods(Category category) {
        Iterator<Goods> iterator = category.getGoodsSet().iterator();
        while (iterator.hasNext()) {
            System.out.print(category.getName() + " ");
            System.out.println(iterator.next());
        }
    }
}