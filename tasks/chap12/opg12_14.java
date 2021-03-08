import java.util.*;
import java.io.*;

class opg12_14{
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            System.out.println("Give a file");
            System.exit(1);
        }

        File file = new File(args[0]);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = inp.nextLine();
         
        if(!file.exists()){
            System.out.println("File: " + args[0] + " does not exists");
            System.exit(2);
        } 
            
        readInFile(name, file);
        
        inp.close();
    }


    public static int readInFile(String line, File file) throws Exception{
        int lines = 0;
        String name;
        try(Scanner inp = new Scanner(file);){
            while(inp.hasNext()){
                lines++;
                name = inp.nextLine(); 
                if(line.equals(name)){
                    System.out.println("Name match on line: " + lines);
                    return lines;
                }//else{
                   // System.out.println("Name not found");
                    //return -1; 
                //} 
            }
        }
        return 1;
    }
}
