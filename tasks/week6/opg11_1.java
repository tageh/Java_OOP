import java.util.*;

public class opg11_1{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); 

        System.out.println("Enter 3 numbers: ");
        double side1 = inp.nextDouble();
        double side2 = inp.nextDouble();
        double side3 = inp.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Enter a color");
        String color = inp.next();
        triangle.setColor(color);

        System.out.println("Enter true or false");
        boolean filled = inp.nextBoolean();
        triangle.setFilled(filled);

        System.out.println(triangle.toString());

        System.out.println(triangle.getArea());
        System.out.println(triangle.getColor());
    }

}
