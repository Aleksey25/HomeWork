package lesson17.animal;

import java.io.Serializable;

public class Horse extends Animal implements Serializable{
    private Halter halter;
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                ", name='" + name + '\'' +
                '}';
    }
}
