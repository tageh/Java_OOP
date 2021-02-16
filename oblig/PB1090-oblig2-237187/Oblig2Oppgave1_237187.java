import java.util.*;

public class Oblig2Oppgave1_237187 {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("How many objects do you want?");
        int objs = inp.nextInt();

        ComparableSphere[] shperes = new ComparableSphere[objs];
        
        fillArray(shperes);
        Arrays.sort(shperes, Collections.reverseOrder());

        for(int i = 0; i < shperes.length; i++){
            System.out.println("Sphere " + (i+1) + " " +shperes[i]);
        } 
    }

    public static void fillArray(ComparableSphere[] obj) {
        for(int i = 0; i < obj.length; i++){
            obj[i] = new ComparableSphere(Math.random()*10);
        }    
    }
}
