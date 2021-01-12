import java.util.Scanner;

public class opg5_1{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        while(true){
            System.out.println("Write a java score: ");
            int input = number.nextInt();

            if(input >= 60){
                System.out.println("You pass the exam");
            }
            if(input < 60){
                System.out.println("You dont pass the exam");
            }
            if(input == -1){
                break;
            }


        }
    }


}
