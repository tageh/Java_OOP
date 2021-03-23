public class Rad{
    int[] verdier = new int[8];

    Rad(int[] verdier){
        this.verdier = verdier;
    }
    /**
     * Denne metoden beregner summen av hver rad
     * @return summen av hver enkelt rad
     */
    public int beregnSum(){
        int sum = 0;
        for(int i = 0;i<verdier.length; i++){
            sum += verdier[i];
        }
        return sum;
    }
}
