import java.util.Scanner;



public class opg6_37{
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number and a width");
        int number = inp.nextInt();
        int width = inp.nextInt();

        System.out.println(format(number, width));
    }

    public static String format(int number, int width){
        
        String num = number +"";

        if(num.length() < width){
            for(int i = width -num.length(); i>0; i--){
                
                num = 0 + num;
            }
        }
        return num;
    }

}
