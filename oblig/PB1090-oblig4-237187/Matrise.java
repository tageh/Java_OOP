import java.util.*;


class Matrise {
    Rad[] rader;
    int maksSum;
    int maksSumRadNr;

    Matrise(int radLengde){
        this.rader = fyllRaderRandomInt(radLengde);
        //Kjører ikke finnMaksSumRad her fordi vi ønsker å ta tiden for data-generering og kjøring av finnMaksSumRad hver for seg
        //maksSum = finnMaksSumRad(rader);
    }

    public Rad[] fyllRaderRandomInt(int lengde) {
        rader = new Rad[lengde];

        Random random = new Random();

        for (int radNr = 0; radNr < lengde; radNr++)
        {

            int[] verdi = new int[lengde];
            for (int indeks = 0; indeks < lengde; indeks++)
            {
                verdi[indeks] = random.nextInt(16);
            }
            rader[radNr] = new Rad(verdi);
        }

        return rader;

    }

    void skrivUtVerdier(){
        for(int i = 0; i < rader.length; i++){
            for(int j = 0; j < rader[i].verdier.length; j++){
                System.out.print(rader[i].verdier[j] + " ");
            }
            System.out.println();
        }
    }

    int finnMaksSumRad(Rad[] rader, int start, int stop){


        int radSum = rader[0].sum;
        this.maksSumRadNr = 1;

        for(int indeks = start+1; indeks <stop; indeks++) {
            //Det må gjøres litt "ekstra arbeid" før beregning av sum kan starte...
            rader[indeks].behandleDataForSum();

            if(radSum < rader[indeks].sum){
                radSum = rader[indeks].sum;
                //Dette er ikke så viktig lenger...
                //this.maksSumRadNr = indeks + 1;
                //System.out.println("besteRadNr: "+ besteRadNr);
            }
        }
        return radSum;
    }
}
