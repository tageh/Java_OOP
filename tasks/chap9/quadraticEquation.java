
public class quadraticEquation{
    private double a;
    private double b;
    private double c;

    quadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }


    //getter
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
         return c;
    }


    public double getDiscriminant(){
       return Math.pow(b, 2) - 4*a*c;
    }

    public double getRoot1(){
        return getDiscriminant() < 0 ? 0 : ((-b) + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }

    public double getRoot2(){
        return getDiscriminant() < 0 ? 0 : ((-b) - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }

}
