import java.util.*;

public class Oblig2Oppgave1 {

    public static void main(String[] args){

        ComparableSphere[] shperes = {
            new ComparableSphere(2),
            new ComparableSphere(5),
            new ComparableSphere(3),
            new ComparableSphere(7),
            new ComparableSphere(10),
            new ComparableSphere(1)
        };
        
        Arrays.sort(shperes, Collections.reverseOrder());

        for(ComparableSphere shpere: shperes){
            System.out.println(shpere.toString());
        } 
    }
}

