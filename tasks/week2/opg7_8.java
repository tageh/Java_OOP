import java.util.*;

public class opg7_8{
    public static void main(String[] args) {
        double[] numbers = new double[10];   

        System.out.println("Enter 10 double values: ");
        fillArray(numbers);
       
        System.out.println("Average values are: " + average(numbers)); 

    }

    public static void fillArray(double[] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
    }

    public static int average(int[] array){
        int average = 0;
        for( int i : array){
            average += i;
        }
        return average/array.length;
    }

    public static double average(double[] array){
        int average = 0;
        for(double i : array){
             average += i;
        }    
        return average/array.length;
    }
}
