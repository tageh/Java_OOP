import java.util.*;

public class opg7_2{
    public static void main(String[] args) {
     
     int[] numbers = new int[11];   
     
     System.out.println("Enter 11 integers: ");

     fill(numbers);
    
     check(numbers);
    }

    public static void fill(int[] array){
       Scanner input = new Scanner(System.in); 
       for(int i = 0; i < array.length; i++){
           array[i] = input.nextInt();
       }
    }

    public static void check(int[] array){
        int last = array[10];
        for(int i = 0; i < array.length; i++){
           if(array[i] > last)
              System.out.println(array[i] + " is grater than "+ last); 
           if(array[i] < last)
              System.out.println(array[i] + " is less than "+ last); 
           if(array[i] == last)
              System.out.println(array[i] + " is equal to " + last);
        }

    } 
}
