import java.util.*;

public class Oblig2Oppgave1 {

    public static void main(String[] args){

        ComparableSphere[] kuler = {
            new ComparableSphere(2),
            new ComparableSphere(5),
            new ComparableSphere(3),
            new ComparableSphere(7)
        };
        
        Arrays.sort(kuler, Collections.reverseOrder());

         for(int i = 0; i < kuler.length; i++){
            System.out.println(kuler[i].toString()); 
        } 
    }
}

