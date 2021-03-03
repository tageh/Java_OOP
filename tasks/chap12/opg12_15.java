import java.io.*;
import java.util.*;

public class opg12_15{
    public static void main(String[] args) throws Exception {
        
        File file = new File("Opg15Navn.txt");

        if(file.exists()){
            System.out.println("File already exists, choose another name");
            System.exit(0);
        }

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a name");
        
        for(int i = 0; i < 3; i++){
            
            String name = inp.nextLine();

            writeInFile(name, file);
        }
    }


    public static int writeInFile(String name, File file) throws Exception{
        
        try(PrintWriter output = new PrintWriter(file)){
            output.println(name);
        } 

        System.out.println(name);

       return 1; 
    }
}
