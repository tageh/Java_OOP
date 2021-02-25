

public class opg9_2{
    public static void main(String[] args) {
       Stock stock = new Stock("ORCL", "Oracle Corp");

       stock.previusClosingPrice = 34.5;
       stock.currentPrice = 35.5;

       System.out.println(stock.previusClosingPrice);
       System.out.println(stock.currentPrice);

       System.out.println(stock.getChangePercent());
    }

}
