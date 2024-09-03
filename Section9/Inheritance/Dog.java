package Section9.Inheritance;

public class Dog extends Animal implements IMovable { // extends indicates an inheritance relationship
    public Dog( String name, double weight) {
        super(name, weight); // calling to the ctr of the superclass animal.
    } // end ctr

    @Override 
    public String makeNoise(){
        return "Woof!";
    }

    @Override
    public String move(){
        return "I'm wagging my tail";
    }

}
