package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class Studio {

    public void dressMan(Clothing[] clothings) {
        System.out.println("Man's cloth");
        for (Clothing clothe : clothings) {
            if (clothe instanceof MensClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWoman(Clothing[] clothings) {
        System.out.println("Woman's cloth");
        for (Clothing clothe : clothings) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }
        }
    }

}
