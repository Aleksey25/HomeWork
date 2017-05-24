package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class ClothingDemo {
    public static void main(String[] args) {
        Clothing[] good = new Clothing[4];
        good[0] = new Tie(Sizes.M, 200, "red");
        good[1] = new Tshort(Sizes.M, 250, "white");
        good[2] = new Trousers(Sizes.L, 1050, "black");
        good[3] = new Skirt(Sizes.S, 600, "yellow");

        Studio studio = new Studio();
        studio.dressMan(good);
        System.out.println();
        studio.dressWoman(good);
    }
}


