package lesson12;

/**
 * Created by home pc on 30.05.2017.
 */
public class OOP {
    public static void main(String[] args) {
        String text = "The key feature of object oriented programming is encapsulation \n" +
                "- bundling data and program instructions into \n" +
                "modules called objects.\n" +
                "A second key feature of object oriented programming is inheritance. This \n" +
                "allows object oriented programming developers to define one class of \n" +
                "objects, say Rectangles, and a specific instance \n" +
                "of this class.\n" +
                "A third principle behind object oriented programming is polymorphism. \n" +
                "This means that different objects can receive the \n" +
                "same instructions but deal with them in different \n" +
                "ways.";

        String regexp = "(?i)object\\s*oriented\\s*programming";
        text = text.replaceAll(regexp, "OOP");
        System.out.println(text);
    }
}
