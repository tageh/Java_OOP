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
        String line;
        int count = 0;
        sjekkFil();
        try(
                BufferedReader reader = new BufferedReader( new FileReader(filnavn));
            ){
            while((line = reader.readLine()) != null){
                String[] parts = line.split(" ");
                int[] temp = new int[parts.length];
                
                for(int i = 0; i<parts.length; i++){
                    temp[i] = Integer.parseInt(parts[i]);
                }
                rader[count++] = new Rad(temp);
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

	void sjekkFil(){
        File fil = new File(this.filnavn);
		if(!fil.exists()){
            System.out.println("Filen: \""+ fil.toString() + "\" eksisterer ikke");
		    System.exit(2);
		}
	}

    void lengdeMatrise() throws Exception{ //Skal finne lenden på radene
        File fil = new File(filnavn);
        int teller = 0;

        try(
            Scanner inp = new Scanner(fil);
        ){
           while(inp.hasNext()){
               int[] num = {inp.nextInt()};
               
           } 
        }
    }

    public int getRadNr(){
        return radNr;
    }

    public int getMakSum(){
        return maskSum;
    }
    
}
