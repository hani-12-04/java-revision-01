package Section9.Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Bob", 80);
        Dog myDog = new Dog("Rod", 50);
        Cat myCat = new Cat("Tokyo", 30);


        System.out.println("Name " + myAnimal.getName());
        System.out.println("Weight " + myAnimal.getWeight());
        System.out.println("Animal says, " + myAnimal.makeNoise());

        System.out.println("Name " + myDog.getName());
        System.out.println("Weight " + myDog.getWeight());
        System.out.println("Animal says, " + myDog.makeNoise());

        
        System.out.println("Name " + myCat.getName());
        System.out.println("Weight " + myCat.getWeight());
        System.out.println("Animal says, " + myCat.makeNoise());
        
    }
    
}
