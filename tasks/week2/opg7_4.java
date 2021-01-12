import java.util.Scanner;


public class opg7_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter score: ");

        int[] scores = new int[100];
        int num, numberOfScores, average;
        numberOfScores = average = 0;

        for(int i = 0; i<100; i++){
            num = input.nextInt();
            if(num < 0){
                break;
            } 
                scores[i] = num;
                average += num;
                numberOfScores++;
            
        }

        average /= numberOfScores;

        int aboveOrEqual, below;
        aboveOrEqual = below = 0;
        
        for(int i = 0; i < numberOfScores; i++){
            if(scores[i] >= average){
                aboveOrEqual++;
            }else{
                below++;
            }

        }   

        System.out.println("\nAverage of scores: " + average);

        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }

}
