import java.util.*;
import java.io.*;

public class Matrise{
    private int radNr;
    private int maskSum;
    private Rad[] rader = new Rad[8];
    private String filnavn;
    
    Matrise(String filnavn){
        this.filnavn = filnavn;
    }

    /**
     *Denne metoden fyller objekter av typen Rad med hver sin rad av matrisen
     *den fyller et array med alle tallene i filen og legger det i temp array som da legger de i en temp array
     *slik at den kan bli sent inn til Rad objektet
     */
    public void fyllRaderFraFil() throws Exception, IOException{
        File fil = new File(filnavn);
        int teller = 0;
        int[] tall = new int[8];

        try(
                Scanner filData = new Scanner(fil);
            ){
            while(filData.hasNext()){
                int[] temp = new int[tall.length];
                for(int i = 0; i < tall.length; i++){
                    tall[i] = filData.nextInt();
                    temp[i] = tall[i];
                }
                rader[teller++] = new Rad(temp);
            }
        }
    } 
    
    /**
     *Denne metoden finner ut hvilken rad som har den storste summen,
     *den bruker beregnSum metoden fra Rad klassen til sjekke om hvilken som er storst. 
     *
     */
    public void finnMaksSumAvRader(){
        int sum = 0;
        for(int i = 0; i<rader.length; i++){
           if(rader[i].beregnSum() > sum){
               sum = rader[i].beregnSum();
               radNr = i;
           }
        }
        maskSum = sum;
    }

    /**
     *Denne metoden skriver ut matrisen i sin helhet.
     *Den sjekker lengden paa arrayen de ligger i og bruker en nested loop for aa skrive ut
     */
    public void skrivUtMatrise(){
        for(int i = 0; i <rader.length; i++){
            for(int j = 0; j<rader[i].verdier.length; j++){
                System.out.print(rader[i].verdier[j] + " ");
            }
            System.out.println();
        }
    } 

    public int getRadNr(){
        return radNr;
    }

    public int getMakSum(){
        return maskSum;
    }
    
}
