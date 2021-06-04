import java.util.*;
import java.lang.Math.*;

class Circle{
    
    double radius = 0;
    
    Circle(){
    }

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }
    
    void setRadius(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }

    double calculatrPerimiter(){
        return Math.PI*radius*2;
    }

    boolean equals(Circle obj){
        if(this.radius == obj.radius){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Circle has radius " + this.radius + "  and has an area of " + calculateArea(); 
    }
}
