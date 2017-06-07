package lesson13.minmax;

/**
 * Created by belkin on 07.06.2017.
 */
public class MinMax<T extends Number> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public void minmax() {
        T min = arr[0];
        T max = arr[0];
        for (T t : arr) {
            if (t.doubleValue() > max.doubleValue()) {
                max = t;
            }
            if (t.doubleValue() < min.doubleValue()) {
                min = t;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
