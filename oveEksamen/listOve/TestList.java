import java.util.*;
import java.io.*;

class TestList{
    public static void main(String[] args) throws IOException{
        Liste<String> MyList = new Liste<String>();

        Scanner inp = new Scanner(System.in);
        
        System.out.println("What do you want to add to the list: ");    
        String input = inp.nextLine(); 

        do{
            MyList.add(new String(input));
            input = inp.nextLine();
        }while(!input.equals("Exit"));
        
        System.out.println("Printing out list: \n");
        MyList.printList();
        
        try{
            FileWriter writer = new FileWriter("name.txt");
            for(int i = 0; i<MyList.sizeList(); i++){
                writer.write(MyList.get(i).toString()+ "\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

