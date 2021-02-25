import java.util.Scanner;

public class opg3_14{
    public static void main(String[] args) {
        
        int num1 = (int)(Math.random()*2);

        System.out.println(num1);
        System.out.println("Guess if its head or tales 1 for head and 0 for tale");

        Scanner inp = new Scanner(System.in);
        int ans = inp.nextInt();
        
        if(ans == num1){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong");
        }

    }
}
