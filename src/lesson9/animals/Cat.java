package lesson9.animals;


public class Cat extends Animal {
    private String breed;
    private static final int SLEEP_TIME = 14;

    public Cat(String animalType, String food, String location, String noise, String breed) {
        super(animalType, food, location, noise);
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println("Cat спит: " + SLEEP_TIME + " часов");
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static int getSleepTime() {
        return SLEEP_TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return breed != null ? breed.equals(cat.breed) : cat.breed == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
