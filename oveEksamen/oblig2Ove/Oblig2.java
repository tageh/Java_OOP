import java.util.*;

class Oblig2{

    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        System.out.println("How many spheres do you want?");
        int kuler = inp.nextInt();
        
        ComparableSphere[] sphere = new ComparableSphere[kuler];

        fillArray(sphere);
        Arrays.sort(sphere, Collections.reverseOrder());

        for(int i = 0; i< sphere.length; i++){
           System.out.println("Sphere " + (i+1) + " " + sphere[i]);
        }
    }

    public static void fillArray(ComparableSphere[] obj){
        for(int i = 0; i < obj.length; i++){
            obj[i] = new ComparableSphere(Math.random()*10);
        }
    }
}
