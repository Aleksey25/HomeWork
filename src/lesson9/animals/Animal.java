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

    public void sleep(Animal animals) {
        int time;
        if (animals.animalType.equals("Dog")) {
            time = Dog.getSleepTime();
            System.out.println("Животное " + animals.animalType + " спит: " + time + " часов");
        } else if (animals.animalType.equals("Cat")) {
            time = Cat.getSleepTime();
            System.out.println("Животное " + animals.animalType + " спит: " + time + " часов");
        } else if (animals.animalType.equals("Horse")) {
            time = Horse.getSleepTime();
            System.out.println("Животное " + animals.animalType + " спит: " + time + " часов");
        }
    }

    public void makeNoise(Animal animals) {
        System.out.println(animals.animalType + "  " + noise);
    }

    public void eat(Animal animals) {
        System.out.println(animals.animalType + " is eating " + food);
    }

    public void info() {
        System.out.println("Животное " + animalType);
        System.out.println("ест " + food);
        System.out.println("живет в " + location);
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
