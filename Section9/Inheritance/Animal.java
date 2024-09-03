package Section9.Inheritance;

public abstract class Animal {
    // creating fields
    private String name;
    private double weight;
    
    // ctrs
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String makeNoise();   
    
}
