
public class opg5_10{
    public static void main(String[] args) {
       final int NumPerLine = 10; 
        int teller = 0;
        for(int i = 100; i<=1000; i++){
            if(i % 3 == 0 && i % 4 == 0){
                teller++;
                if(teller % NumPerLine == 0){
                    System.out.println(i);
                }else{
                    System.out.println(i + " ");
                }

            }
        }
    }


}
