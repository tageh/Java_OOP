import java.util.*;

public class opg7_1{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of studens: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];

        System.out.println("Enter "+ scores.length +" scores: ");
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();        
        }

        getGrades(scores, grades);

        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is "+ scores[i] + " and grade is " +grades[i]);
        }

        
                   
   } 

   public static int max(int[] array){
       int max = array[0];
       for(int i = 0; i < array.length; i++){
           if( array[i] > max)
                max = array[i];
       }
       return max;
   }
   
   public static void getGrades(int[] scores, char[] grades){
       int best = max(scores);
       for(int i = 0; i < scores.length; i++){
          if(scores[i] >= best -5)
             grades[i] = 'A'; 
          else if(scores[i] >= best -10)
              grades[i] = 'B';
          else if(scores[i] >= best - 15)
              grades[i] = 'C';
          else if(scores[i] >= best -20 )
              grades[i] = 'D';
          else
              grades[i] = 'F';
       }
   }
   

}
