package Section2.src;
import java.util.Scanner;

public class Project2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String adjective1;
        String girlsName ;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("Enter an adjective:\t");
        adjective1 = keyboard.nextLine();

        System.out.println("Enter a girl's name:\t");
        girlsName = keyboard.nextLine();

        System.out.println("Enter another adjective:\t");
        adjective2 = keyboard.nextLine();

        System.out.println("Enter an occupation:\t ");
        occupation1 = keyboard.nextLine();

        System.out.println("Enter the name of a place:\t ");
        placeName = keyboard.nextLine();

        System.out.println("Enter the name of a piece of clothing:\t ");
        clothing = keyboard.nextLine();

        System.out.println("Enter the name of a hobbby:\t");
        hobby = keyboard.nextLine();

        System.out.println("Enter another adjective:\t");
        adjective3 = keyboard.nextLine();

        System.out.println("Enter another occupation:\t");
        occupation2 = keyboard.nextLine();

        System.out.println("Enter a boys name:\t");
        boysName = keyboard.nextLine();

        System.out.println("Enter a mans name:\t");
        mansName = keyboard.nextLine();

        System.out.println("There once was " + adjective1 + " girl named " + girlsName + ", who was a " + adjective2 + 
                            " " + occupation1 + " in the Kingdom of " + placeName + ".");

        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 + "" + occupation2 + " named " + boysName + " but her father, king " + mansName + " forbid her from seeing him.");
        
    } // end main
}
