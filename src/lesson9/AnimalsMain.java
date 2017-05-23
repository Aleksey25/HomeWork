package lesson9;


import lesson9.animals.Animal;
import lesson9.animals.Cat;
import lesson9.animals.Dog;
import lesson9.animals.Horse;

public class AnimalsMain {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Dog("Dog", "Meat", "Yard", "bow-bow..", "Keeper");
        pets[1] = new Cat("Cat", "Fish", "House", "meow", "British");
        pets[2] = new Horse("Horse", "Wheat", "Stable", "neighing", "Black");

        for (Animal animal : pets) {
            animal.sleep();
            animal.makeNoise();
            animal.eat();
            PetDoctor.treatAnimal(animal);
            System.out.println();
        }
    }
}
