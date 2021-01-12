import java.util.Scanner;

public class opg7_2{
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("Enter 11 numbers: ");
            
       fill(array); 

       for(int i = array.length -1; i >= 0; i--){
            System.out.println(array[i] + " ");

        }
    }
    
    public static void fill(int[] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        
    }

}
