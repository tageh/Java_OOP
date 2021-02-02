import java.util.*;

public class Oblig1Oppgave2_237187{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int element = input.nextInt();

        double[][] matrix = new double[element][element];

        fillArray(matrix);
        printArray(matrix);           

        Location location = new Location();

        location.locateLargestElement(matrix);
       
        System.out.println("Largest element in the matrix is: " + location.maksVerdi+" and has the position: row: "+ location.radNr+ " coloumn: " + location.kolonneNr); 
        
        input.close();    
    }

    public static void fillArray(double[][] array){
        Random randNum = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] =Math.round(randNum.nextDouble()*1000);
            }
        }
    }

    public static void printArray(double[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


class Location{
    public int radNr = 0;
    public int kolonneNr = 0;
    public double maksVerdi = 0;

    Location(){
        
    }

    public void locateLargestElement(double[][] matrix){
        maksVerdi = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <matrix[i].length; j++){
                if(matrix[i][j] > maksVerdi){
                    radNr = i+1;
                    kolonneNr = j+1;
                    maksVerdi = matrix[i][j];    
                }
            }
        }        
    }
}
