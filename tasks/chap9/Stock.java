// Excersice 9.2


public class Stock{
    
    String symbol;
    String name;
    double previusClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent(){
        return ((currentPrice - previusClosingPrice) / previusClosingPrice) * 100;
    }

}
