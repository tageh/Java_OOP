import java.util.*;

import jdk.internal.org.jline.reader.SyntaxError;

public class Oblig1Oppgave1_237187{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the coordiates: ! \n");
        System.out.println("x1: ");
        double x1 = input.nextDouble();
        System.out.println("y1: ");
        double y1 = input.nextDouble();

        System.out.println("x2: ");
        double x2 = input.nextDouble();
        System.out.println("y2: ");
        double y2 = input.nextDouble();

        System.out.println("x3: ");
        double x3 = input.nextDouble();
        System.out.println("y3: ");
        double y3 = input.nextDouble();

        System.out.println("x4: ");
        double x4= input.nextDouble();
        System.out.println("y4: ");
        double y4 = input.nextDouble();


        double a = (y1-y2);
        double b = -(x1 - x2);
        double c = (y3-y4);
        double d = -(x3-x4);
        double e = (y1 - y2) * x1 - (x1 -x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        
        LinearEquation Le = new LinearEquation(a,b,c,d,e,f);
        
        Le.printIntersectionPoint();

    }

    


}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getX() {
        return (e * d - b * f) / ab_Minus_bc();
    }

    public double getY() {
        return (a * f - e * c) / ab_Minus_bc();
    }

    public boolean isSolvable(){
        return ab_Minus_bc() != 0;
    }

    private double ab_Minus_bc(){
        return a * d - b * c;
    }

    public void printIntersectionPoint(){
        System.out.println("Intersection point is: " + getX() +"," + getY());
    }

}

