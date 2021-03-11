class Rad{
    int[] verdier = new int[8];

    Rad(int[] verdier){
        this.verdier = verdier;
        
    }

    int beregnSum(){
        int sum = 0;
        for(int i = 0;i<verdier.length; i++){
            sum += verdier[i];
        }
        return sum;
    }
}
