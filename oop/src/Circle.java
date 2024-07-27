package oop.src;

public class Circle {
    private double radius;


    public Circle(){
        this(1.0);
    
    } // no arg ctr

    public Circle(double radius){
        this.radius = radius;
    } // end ctor

    public double getRadius(){
        return radius;
    } //end getRadius

    public void setRadius(){
        this.radius = radius;
    } //end setRadius

    public double circrumference(){
        return 2 * Math.PI * radius; //math.pi is the pi 
    } //end circumference

    public double area(){
        return Math.PI * Math.pow(radius,2); //math.pow is radius squared
    } // end area


} // end of circle class
