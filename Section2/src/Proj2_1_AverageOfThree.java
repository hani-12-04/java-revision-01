package Section2.src;
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("The first real number");
        n1 = keyboard.nextDouble();
        n2 = keyboard.nextDouble();
        n3 = keyboard.nextDouble();
        keyboard.nextLine(); // good habit

        double average = (n1 + n2 + n3) / 3.0;
        System.out.println("Average is " + average);

    } // end main
    
}
