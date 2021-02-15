class Sphere extends Circle {

      //Vi trenger ikke å lage kode for konstruktør i denne klassen, pga. vi får radius fra Circle-klassen når når sirkel-objekt blir opprettet. 


      public double calculateArea(){
        //Henter radius fra superklassen Circle her:
        return 4*Math.PI*Math.pow(super.getRadius(), 2);
      }

      public double calculateVolume(){
        //Henter radius fra superklassen Circle her:
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
