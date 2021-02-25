import java.util.GregorianCalendar;

public class opg9_5{
    public static void main(String[] args) {
        GregorianCalendar claender = new GregorianCalendar();

        System.out.println(claender.get(GregorianCalendar.YEAR));
        System.out.println(claender.get(GregorianCalendar.MONTH));
        System.out.println(claender.get(GregorianCalendar.DAY_OF_MONTH));

        claender.setTimeInMillis(1234567898759L);
        
        System.out.println(claender.get(GregorianCalendar.YEAR));
        System.out.println(claender.get(GregorianCalendar.MONTH));
        System.out.println(claender.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
