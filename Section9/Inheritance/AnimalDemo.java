package Section9.Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rover" , 70);
        Cat myCat = new Cat("Tokyo",40);


        System.out.println(myDog.move());
        System.out.println(myCat.move());
    }
    
    public static void printAnimals(Animal[] animals) {
        for(Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getWeight());
            System.out.println(animal.makeNoise());
        }
        
    }
}