import java.util.Scanner;
import java.text.DecimalFormat;

public class opg4_1{
 

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter the length from the center to a vertex: ");

        double radius = inp.nextDouble();

        double s = (2*radius)*Math.sin(Math.PI/5);

        double area = (5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5)); 
        String output = String.format("%.2f", area);
        System.out.println("The area of the pentagon is :" + output);
    }


}
