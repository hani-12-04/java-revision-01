package Section2.src;

public class RelationalFun {
    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 26;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);
        

        // relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparison);

        ageComparison = currentAge >= 21;
        System.out.println("currentAge >= 21?: " + ageComparison);

    } // end main
    
}
