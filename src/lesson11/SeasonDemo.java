package zzz;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by student on 5/21/2017.
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        switch (season) {
            case WINTER: {
                System.out.println("Идет снег");
                break;
            }
            case SPRING: {
                System.out.println("Теплеет");
                break;
            }
            case SUMMER: {
                System.out.println("Жарко");
                break;
            }
            case AUTUMN: {
                System.out.println("Идет дождь");
                break;
            }
        }
        System.out.println();

        for (Season c : Season.values()) {
            System.out.println(c.ordinal() + " " + c + " " +  c.getTemp());
            c.getDescription();
        }
        System.out.println();

        season = Season.valueOf("WINTER");
        System.out.println(season);
    }
}


