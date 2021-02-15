import java.util.*;

public class Oblig2Oppgave1 {

    public static void main(String[] args){
        
        ComparableSphere[] shperes = {
            new ComparableSphere(1),
            new ComparableSphere(4),
            new ComparableSphere(8),
            new ComparableSphere(2)
        }; 

        Arrays.sort(shperes);

        for(ComparableSphere shpere: shperes){
            System.out.println(shperes.toString() + " ");;
            System.out.println();
        }

    }
}
