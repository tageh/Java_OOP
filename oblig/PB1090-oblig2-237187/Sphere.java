class Sphere extends Circle {

      public double calculateArea(){
        return 4*Math.PI*Math.pow(super.getRadius(), 2);
      }

      public double calculateVolume(){
        return 4*Math.PI*Math.pow(super.getRadius(), 3) / 3.0;
      }

      public String toString(){
        return "Kule med radius = " 
          + super.getRadius() 
          + "\nhar areal = " 
          + this.calculateArea()
          + "\nog volum = " + calculateVolume();
      }

}
