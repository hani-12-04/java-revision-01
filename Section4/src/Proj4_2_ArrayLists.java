package Section4.src;
import java.util.ArrayList;
import java.util.Scanner;


public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Double> myAL = new ArrayList<>();

        double input;

        System.out.println("Enter 0 or more to put in the list " + "or -1 to exit");

        input = keyboard.nextDouble();

        while( input >= 0){
            myAL.add(input);
            System.out.println("Enter 0 or more to put in the list " + "or -1 to exit");

            input = keyboard.nextDouble();

        } // end while

        for(int i = myAL.size() - 1; i >=0; i--){
            System.out.println((myAL.get(i)));
        }       
    } // end main   
}
