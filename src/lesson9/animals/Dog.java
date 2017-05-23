package lesson9.animals;


public class Dog extends Animal {
    private String kind;
    private static final int SLEEP_TIME = 6;

    public Dog(String animalType, String food, String location, String noise, String kind) {
        super(animalType, food, location, noise);
        this.kind = kind;
    }

    @Override
    public void sleep() {
        System.out.println("Dog спит: " + SLEEP_TIME + " часов");
    }


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public static int getSleepTime() {
        return SLEEP_TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return kind != null ? kind.equals(dog.kind) : dog.kind == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
