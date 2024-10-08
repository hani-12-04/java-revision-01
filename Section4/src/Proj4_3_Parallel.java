package Section4.src;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a name:\t");
            name = keyboard.nextLine(); 
            
            System.out.println("Enter an age:\t ");
            age = keyboard.nextInt();
            // consume new line
            keyboard.nextLine();

            names.add(name);
            ages.add(age);

        } // end for        

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old ");
        }
    } // end main
}
