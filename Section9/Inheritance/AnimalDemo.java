package Section9.Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
     Animal anotherAnimal = new Dog("Sam", 100);

     System.out.println("Name: " + anotherAnimal.getName());
     System.out.println("Weight: " + anotherAnimal.getWeight());
     System.out.println("Animal Says " + anotherAnimal.makeNoise());
    }
    
}
