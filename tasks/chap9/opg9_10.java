import java.util.*;

public class opg9_10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        quadraticEquation abc = new quadraticEquation(a, b, c);

        if(abc.getDiscriminant() < 0){
            System.out.println("No roots");
        }else if(abc.getDiscriminant() > 0){
           System.out.println("Two roots: " + abc.getRoot1() + "Root 2: " + abc.getRoot2()); 
        }else{
            System.out.println("one root: " + (abc.getRoot1() > 0 ? abc.getRoot1() : abc.getRoot2()));
        }
        
    }
}
