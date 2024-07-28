package Section2.src;

public class ArithemticFun {
    public static void main(String[] args) {
        int a = 10;
        int b =15;

        // e.g BINARY operators
        int result =  a + b;
        int difference = a - b;
        int product = a * b;
        int division  = a / b ;
        int modulus = a % b;
        
        System.out.println("result is " + result);
        System.out.println("result is " + difference);
        System.out.println("result is " + product);
        System.out.println("result is " + division);
        System.out.println("result is " + modulus);

        // UNIARY operators
        result += 20; // result = result + 20
        System.out.println("result is now " + result);

        result++; //++result;
        System.out.println("result++ " + result);

        result--; //--result;
        System.out.println("result-- " + result);

        product *= 2; //product = product * 2;
        System.out.println("Final value of product is " + product);

    } // end main
    
}
