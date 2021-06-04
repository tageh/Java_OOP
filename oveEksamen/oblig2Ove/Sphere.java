import java.util.*;

class Sphere extends Circle{
    Sphere(){}

    Sphere(double radius){
        super(radius);
    }

    double calculateVolume(){
        return 4/3*Math.PI*Math.pow(super.getRadius(),3);
    }

    public String toString(){
        return "Sphere has radius: " + super.getRadius() + " and volume: " +calculateVolume();
    }
}
