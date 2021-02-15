import java.util.*;

public class Oblig2Oppgave1 {

    public static void main(String[] args){
        
        ComparableSphere kule1 = new ComparableSphere(3);
        ComparableSphere kule2 = new ComparableSphere(2);
        ComparableSphere kule3 = new ComparableSphere(5);
        ComparableSphere kule4 = new ComparableSphere(2);

        System.out.println(kule1.compareTo(kule2));
        System.out.println(kule2.compareTo(kule4));

        //System.out.println(kule2.toString());
        


        ComparableSphere[] shperes = {
            new ComparableSphere(1),
            new ComparableSphere(4),
            new ComparableSphere(8),
            new ComparableSphere(2)
        }; 

        Arrays.sort(shperes, Collections.reverseOrder());

          for(ComparableSphere shapre: shperes){
            System.out.println(shapre.toString());
        }

    }
}


//CocInstall coc-snippets pa popos
