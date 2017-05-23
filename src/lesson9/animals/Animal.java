package lesson9.animals;


public class Animal {
    private String animalType;
    private String food;
    private String location;
    private String noise;

    public Animal() {
    }


    public Animal(String animalType, String food, String location, String noise) {
        this.animalType = animalType;
        this.food = food;
        this.location = location;
        this.noise = noise;
    }

    public void sleep() {
    }

    public void makeNoise() {
        System.out.println(animalType + " makes noise " + noise );
    }

    public void eat() {
        System.out.println(animalType + " eats " + food );
    }

    public void info() {
        System.out.println("Animal: " + animalType);
        System.out.println("eats " + food);
        System.out.println("lives in " + location);
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (animalType != null ? !animalType.equals(animal.animalType) : animal.animalType != null) return false;
        if (food != null ? !food.equals(animal.food) : animal.food != null) return false;
        if (location != null ? !location.equals(animal.location) : animal.location != null) return false;
        return noise != null ? noise.equals(animal.noise) : animal.noise == null;
    }

    @Override
    public int hashCode() {
        int result = animalType != null ? animalType.hashCode() : 0;
        result = 31 * result + (food != null ? food.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (noise != null ? noise.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }
}
