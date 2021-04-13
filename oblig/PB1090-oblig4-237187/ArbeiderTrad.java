class ArbeiderTrad implements Runnable{
    int antall;
    int start;
    int stop;
    int maksSumRad;
    Matrise matrise;
    Rad[] lokaleRader;
    long totalTidPralell;

    ArbeiderTrad(int antall, Matrise matrise, int start, int stop){
       this.antall = antall; 
       this.matrise = matrise;
       this.start = start;
       this.stop = stop;
       
    }

    public void run(){
        
        long startTidParalell = System.nanoTime();
        maksSumRad = matrise.finnMaksSumRad(matrise.rader, start, stop); 
        long sluttTimeParalell = System.nanoTime();
        totalTidPralell = (sluttTimeParalell - startTidParalell)/(1000*1000);  //divide by 1000*1000 to get milliseconds.

        System.out.println("Paralell algoritme tok: "+totalTidPralell + "ms");
        System.out.println("Paralell algoritme tok: "+totalTidPralell/1000 + "sek");

        System.out.println("Maks sum av rad: "+maksSumRad);
    }
    
}
