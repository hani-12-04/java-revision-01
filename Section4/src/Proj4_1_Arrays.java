package Section4.src;
import java.util.Arrays;
import java.util.Scanner;

public class Proj4_1_Arrays {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] myArray = new int[5];

         for(int i=0; i < myArray.length; i++){
            System.out.print("Enter an integer\t");
            myArray[i] = keyboard.nextInt();

        } // end for

          for(int i=0; i < myArray.length; i++){
           int result = myArray[i] * 2; 
           System.out.println("result is " + result);
        }
        
    } // end main
    
}
