import java.util.*;

public class Oblig2Oppgave1_237187 {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("How many objects do you want?");
        int objs = inp.nextInt();

        ComparableSphere[] shperes = new ComparableSphere[objs];
        
        fillArray(shperes);
        Arrays.sort(shperes, Collections.reverseOrder());

        for(ComparableSphere shpere: shperes){
            System.out.println(shpere.toString());
        } 
    }

    public static void fillArray(ComparableSphere[] obj) {
        for(int i = 0; i < obj.length; i++){
            obj[i] = new ComparableSphere(Math.random()*10);
        }    
    }
}
