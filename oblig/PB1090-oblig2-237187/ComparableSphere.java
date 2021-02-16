public class ComparableSphere extends Sphere implements Comparable<ComparableSphere>{

    public ComparableSphere(double radius){
        super(radius);
    }

    @Override
    public int compareTo(ComparableSphere obj){
        if(super.calculateVolume() > obj.calculateVolume()){
            return 1; 
        }else if(super.calculateVolume() < obj.calculateVolume()){
            return -1;
        }
        return 0; 
    }

    @Override
    public String toString(){
       return "Radius: "+ Math.floor(getRadius()*100)/100 +" Volum: "+Math.floor(calculateVolume()*100)/100; 
    }
}
