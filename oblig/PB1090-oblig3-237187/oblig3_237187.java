import java.util.*;
import java.io.*;

class oblig3_237187{
    public static void main(String[] args) throws Exception{

        Matrise matrise = new Matrise("testdata.txt");

        matrise.fyllRaderFraFil();

        matrise.skrivUtMatrise();
    }
}
