import java.util.*;


class Rad{
    int verdier[];
    int sum;

    Rad(int[] verdier){

        this.verdier = new int[verdier.length];

        for(int indeks = 0; indeks < verdier.length; indeks++){
            this.verdier[indeks] =verdier[indeks];
        }

        this.sum = beregnSum(verdier);

    }

    int beregnSum(int[] verdier){
        int sum = 0;
        for(int indeks = 0; indeks < verdier.length; indeks++){
            sum += verdier[indeks];
        }
        return sum;
    }

    public void behandleDataForSum(){
        //Her gjøres det egentlig bare en simulering av "arbeid", som gjør at tidsforbruket stiger...

        //Do some "random" work:
        Arrays.sort(verdier);

        //Do some more "random" work:
        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] *= 2;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] += 5;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] -= 1;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] /= 2;
        }

        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] += 8;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] *= 3;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] -= 1;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] /= 3;
        }
    }
}
