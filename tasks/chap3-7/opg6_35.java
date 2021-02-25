import java.util.Scanner;

public class opg6_35{
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
      System.out.println("Enter the side : "); 
      double side = inp.nextDouble();

      System.out.println("The area of the pentagon is: " + area(side));
    }

    public static double area(double side){
        
        return (5*Math.pow(side, 2))/(4 * Math.tan(Math.PI/5));
        
    }

}
