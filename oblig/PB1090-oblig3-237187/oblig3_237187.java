import java.util.*;
import java.io.*;

public class oblig3_237187{
    public static void main(String[] args) throws Exception, IOException{

        Matrise matrise = new Matrise("testdata.txt");

        matrise.fyllRaderFraFil();
        matrise.skrivUtMatrise();
        matrise.finnMaksSumAvRader();

        System.out.println("Største sum er: " + matrise.getMakSum() + " i rad: " + matrise.getRadNr());
    }
}
