import java.util.*;

class Oblig4_237187 {

    public static void main(String[] args){

        int radLengde = 8000;
        
        Scanner inp = new Scanner(System.in);       

        System.out.println("Antall datapunker totalt: " + radLengde +"*"+radLengde + " = "+ radLengde*radLengde);
        //tid_start:
        long startTidGenerering = System.nanoTime();
        Matrise matrise = new Matrise(radLengde);
        //tid_stopp:
        long sluttTidGenerering = System.nanoTime();
        //tid_totalt:
        long totalTidGenerering = (sluttTidGenerering - startTidGenerering)/(1000*1000);  //divide by 1000*1000 to get milliseconds.

        System.out.println("Generering av data: "+totalTidGenerering + "ms");
        System.out.println("Generering av data: "+totalTidGenerering/1000 + "sek");

        //Sekvensiell del:
        long startTidSekvensiell = System.nanoTime();
        //denne skal ta alle rader = [0-7999], dersom radLengde=8000:
        int maksSumSekvensiell = matrise.finnMaksSumRad(matrise.rader,0,radLengde);
        long sluttTimeSekvensiell = System.nanoTime();
        long totalTidSekvensiell = (sluttTimeSekvensiell - startTidSekvensiell)/(1000*1000);  //divide by 1000*1000 to get milliseconds.

        System.out.println("Sekvensiell algoritme tok: "+totalTidSekvensiell + "ms");
        System.out.println("Sekvensiell algoritme tok: "+totalTidSekvensiell/1000 + "sek");

        System.out.println("Maks sum av rad: "+maksSumSekvensiell);

        //Parallel del:
        //Start her for å komme i gang med oblig4:
        System.out.println("\nOblig4 start");
        System.out.println("Hvor mange traader vil du bruke?");
        int traader = inp.nextInt();

        ArbeiderTrad[] arbeider = new ArbeiderTrad[traader]; 
		Thread[] traad = new Thread[traader];
        
        int lokalRadLengde = radLengde/traader;
        int[] raderSum = new int[traader];
        int totalTidPralell = 0;

      	for (int indeks = 0; indeks < traader; indeks++) { 
			int start = lokalRadLengde * indeks;
            int stop = (lokalRadLengde * (indeks +1) -1); 
            arbeider[indeks] = new ArbeiderTrad(matrise, start, stop);
            traad[indeks] = new Thread(arbeider[indeks]); 
		}

        for(int i = 0; i < traader; i++){
            System.out.println("Traad: "+ i);
            traad[i].start();

            try{
                traad[i].join();
                System.out.println();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }

        for(int i = 0; i < raderSum.length; i++){
            raderSum[i] = arbeider[i].maksSumRad;
            totalTidPralell += arbeider[i].totalTidPralell;
        }
        
        System.out.println("Total tid med paralell er: " + totalTidPralell + "ms");

        System.out.println("Støste summen er :" + finnBesteSumFraAlleTaader(raderSum)); 
        testResultatSekvensiellParallel(maksSumSekvensiell,finnBesteSumFraAlleTaader(raderSum));
        //System.out.println("Oblig4 ferdig");

    }

    public static void testResultatSekvensiellParallel(int sekvensieltResultat, int paralleltResultat){
        if(sekvensieltResultat==paralleltResultat){
            System.out.println("Test OK");
        }
        else{
            System.out.println("Sekvensielt resultat er ikke det samme som parallelt resultat...");
        }
    }

    public static int finnBesteSumFraAlleTaader(int[] raderMaksSum){

        int sum = 0;
        int indeks = 0;
        for(indeks = 0;indeks < raderMaksSum.length; indeks++){
            if(sum < raderMaksSum[indeks]){
                sum = raderMaksSum[indeks];                
            }        
        }
        return sum;
    }
}
