import java.io.*;
import java.util.*;

class opg12_19{
    public static void main(String[] args) throws Exception {
        
        Scanner inp = new Scanner(System.in);

        File autherFile = new File("athour.txt");
        File bookFile = new File("book.txt");
        File BookAuthor = new File("BookAuthor.txt");

        try(PrintWriter output = new PrintWriter(autherFile);
            PrintWriter output2 = new PrintWriter(bookFile);
            PrintWriter output3 = new PrintWriter(BookAuthor);
            ){
            for(int i = 0; i < 2; i++){
                System.out.println("Enter an athour of a book: "); 
                String athour = inp.nextLine();        
                System.out.println("Enter an title assosiated whit the athour: ");
                String book = inp.nextLine();

                output.println(athour + " Author ID: " + i);
                output2.println(book + ", " + i);
                output3.println(athour +" is the author of book: " + book);
            }            
        }
    }
}
