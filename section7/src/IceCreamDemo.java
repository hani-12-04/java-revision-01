package section7.src;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Vanilla", 4, 3);
        IceCream yourIC = new IceCream("Chocolate", 2, 2);

        myIC.addTopping("nuts");
        myIC.addTopping("Cherries");

        yourIC.addTopping("Sprinkles");

        printIC(myIC);
        printIC(yourIC);


    } // end main
    
    public static void printIC(IceCream icecream){
        System.out.println(icecream.getName());
        System.out.println("Cost: $" + icecream.getCost());
        System.out.println("Topped with:");
        icecream.printToppings();
    }// end printIC
    
} // end of IceCreamDemo
