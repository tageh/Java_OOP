// Excersice 9.1

import java.util.*;

public class Rectangle{
    
    double width = 1;
    double height = 1;

    public Rectangle(){
        
    }
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;  
    }


    double getArea(){
        return height*width;
    }

    double getPerimeter(){
        return 2*(width + height);
    }

}
