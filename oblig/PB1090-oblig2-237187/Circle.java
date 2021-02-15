public class Circle{
  private double radius;

  Circle(){
    this(1.0);
  }
  
  Circle(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
      this.radius = radius;
  }

  public double calculateArea(){
    return Math.pow(this.radius, 2)*Math.PI;
  }

  public double getRadius(){
    return this.radius;
  }

  
  public String toString(){
    return "Sirkel med radius = " 
      + this.radius 
      + "\nhar areal = " 
      + this.calculateArea();
  }

  //Litt usikker paa denne, men fikser hvis den er feil
  public boolean equals(Circle obj){
    if(this.radius == obj.radius){
        return true;
    }
    return false;

  }
  

}
