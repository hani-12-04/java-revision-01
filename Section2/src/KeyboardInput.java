package Section2.src;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double realNumber;
        String name;
        int age;
        String city;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); // consume the newLine

        System.out.println("Give me a real number");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine();
        realNumber *= 2;

        System.out.println("What city are you from?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("age is " + age);
        System.out.println("city is " + city);
        System.out.println("real number is " + realNumber);

        
    } //end main

}