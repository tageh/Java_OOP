import java.util.*;
import java.io.*;
import javax.swing.*;
public class oblig3_237187{
    public static void main(String[] args) throws Exception, IOException{
        // TODO Lage gui ut av obligen, har en liten start
        JFrame frame = new JFrame("Oblig3");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);


        Matrise matrise = new Matrise("testdata1.txt");

        matrise.fyllRaderFraFil();
        matrise.skrivUtMatrise();
        matrise.finnMaksSumAvRader();

        System.out.println("Største sum er: " + matrise.getMakSum() + " i rad: " + matrise.getRadNr());

        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel label = new JLabel("Matrise");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JFileChooser file = new JFileChooser();
        file.showSaveDialog(null);
        panel.add(file);

    }
}
