

public class opg6_8{
    public static void main(String[] args) {
        
       System.out.println("Miles    Kilometers"); 
       for(int i = 1; i<=10; i++){
           System.out.println(i+"            " + mileToKilometer(i));
       }
       System.out.println("Kilometers    miles"); 
       for(int i = 20; i<= 65; i+=5){
          i = i +5; 
           System.out.println(i+"            " + kilometerToMile(i));
       }
   } 

   public static double mileToKilometer(double mile){
        return mile * 1.6;   
   }

   public static double kilometerToMile(double kilometer){
        return kilometer/1.6;
   }
}
