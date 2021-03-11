import java.util.*;
import java.io.*;

class Matrise{
    private int radNr;
    private int maskSum;
    private Rad[] rader = new Rad[8];
    private String filnavn;
    
    Matrise(String filnavn){
        this.filnavn = filnavn;
    }


    void fyllRaderFraFil() throws Exception, IOException{
        int teller = 0;
        String linje;
        
        try(
                BufferedReader leser = new BufferedReader(new FileReader(filnavn));
            ){
            while((linje = leser.readLine()) != null){
                String[] deler = linje.split(" ");
                int[] temp = new int[deler.length];
                for(int i = 0; i < deler.length; i++){
                    temp[i] = Integer.parseInt(deler[i]);
                }
                rader[teller] = new Rad(temp);
                teller++;    
            }
        }
    } 
    
    
    void finnMaksSumAvRader(){
        int sum = 0;
        for(int i = 0; i<rader.length; i++){
           if(rader[i].beregnSum() > sum){
               sum = rader[i].beregnSum();
               radNr = i;
           }
        }
        maskSum = sum;
    }

    void skrivUtMatrise(){
        for(int i = 0; i <rader.length; i++){
            System.out.print(i+ " ");
            for(int j = 0; j<rader[i].verdier.length; j++){
                System.out.print(rader[j].verdier[i] + " ");
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
