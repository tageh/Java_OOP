import java.util.*;
import java.io.*;

class Matrise{
    private int radNr;
    private int maskSum;
    private Rad[] rader;
    private String filnavn;
    
    Matrise(String filnavn){
        this.filnavn = filnavn;
        rader = new Rad[8];
    }

    int[] temp = new int[65];

    void fyllRaderFraFil() throws Exception, IOException{
        File fil = new File(filnavn);
        radNr = 0;
        
        if(!fil.exists()){
            System.out.println("Filen finnes ikke");
            System.exit(1);
        }

        try(
            Scanner input = new Scanner(fil);
        ){
            while(input.hasNext()){
                radNr++;
                for(int i = 1; i < temp.length; i++){
                    temp[i] = input.nextInt();
                    int[] lokal_temp = new int[8]; 
                }
                
            }
        }
    } 
    
    
    int finnMaksSumAvRader(){
        
        return 1;
    }

    void skrivUtMatrise(){
        for(int i = 1; i < temp.length; i++){
            System.out.print(temp[i]+ " ");
            if(i % 8 == 0){
                System.out.print("\n");
            }
        } 
    }
}
