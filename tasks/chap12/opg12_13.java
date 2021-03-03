import java.io.*;
import java.util.*;

class opg13_12{
    public static void main(String[] args) throws Exception{

        if(args.length != 1){
            System.out.println("Usage: java filename");
            System.exit(1);
        }
        
        File file = new File(args [0]); 
        if(!file.exists()){
            System.out.println("File " +args[0] + " does not exists");
            System.exit(2);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;
        
        try(Scanner inp = new Scanner(file)){
            while(inp.hasNext()){
                lines++;
                String line = inp.nextLine();
                characters += line.length();   
            }
        }

        try(Scanner inp = new Scanner(file)){
            while(inp.hasNext()){
                String line = inp.next();
                words++;
            }
        }

        System.out.println("File: " + file.getName() + " has");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
         
    }
}
