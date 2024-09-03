package Section9.Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Sam", 100);
        animals[1] = new Cat("Tokyo", 30);
        animals[2] = new Cat("Luna", 40);
        animals[3] = new Cat("Cairo", 50);
        animals[4] = new Dog("Pat", 70);
          

        printAnimals(animals);
    }
    
    public static void printAnimals(Animal[] animals) {
        for(Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getWeight());
            System.out.println(animal.makeNoise());
        }
        
    }
}