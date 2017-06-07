package lesson13.minmax;

/**
 * Created by belkin on 07.06.2017.
 */
public class MinMaxMain {
    public static void main(String[] args) {

        MinMax<Integer> arr1 = new MinMax<>(new Integer[]{5, -44, 458, 6456, 46});
        arr1.minmax();
        System.out.println();

        MinMax<Double> arr2 = new MinMax<>(new Double[]{5.545, -44.4, 458.0, 6456.45, 46.4});
        arr2.minmax();
    }
}
