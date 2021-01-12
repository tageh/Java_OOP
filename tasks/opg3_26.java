import java.util.Scanner;

public class opg3_26{
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int ans = inp.nextInt();

        System.out.println("is " +ans +" dividable by 4 and 5?" + ((ans % 4 == 0) && (ans % 5 == 0)));
        System.out.println("is " +ans +" dividable by 4 or 5?"+((ans % 4 == 0) || (ans % 5 == 0)));
        System.out.println("is " +ans +" dividable by 4 or 5 but not both?"+((ans % 4 == 0) ^(ans % 5 == 0)));



    }


}
