package lesson9;


import lesson9.animals.Animal;
import lesson9.animals.Cat;
import lesson9.animals.Dog;
import lesson9.animals.Horse;

public class AnimalsMain {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Dog("Dog", "Meat", "Yard", "Bow-bow..", "Keeper");
        pets[1] = new Cat("Cat", "Fish", "House", "Meow", "British");
        pets[2] = new Horse("Horse", "Wheat", "Stable", "Neighing", "Black");

        for (Animal animal : pets) {
            animal.sleep(animal);
            animal.makeNoise(animal);
            animal.eat(animal);
            PetDoctor.treatAnimal(animal);
            System.out.println();
        }
    }
}
