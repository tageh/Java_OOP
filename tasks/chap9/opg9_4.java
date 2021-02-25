
public class opg9_4{
    public static void main(String[] args) {
        java.util.Random randNr = new java.util.Random(1000);   

        for(int i = 1; i<=50; i++){
           if(i % 10 == 0){
               System.out.printf("%5d\n", randNr.nextInt(100));
           } 
           else{
               System.out.printf("%5d", randNr.nextInt(100));
           }
        }
    }
}
