public class ComparableSphere extends Sphere implements Comparable<ComparableSphere>{

    public ComparableSphere(double radius){
        super(radius);
    }

    @Override
    public int compareTo(ComparableSphere obj){
        if(super.calculateVolume() > obj.calculateVolume()){
            return 1; 
        }else if(calculateVolume() < obj.calculateVolume()){
            return -1;
        }
        return 0; 
    }

    @Override
    public String toString(){
       return "Volum: "+ calculateVolume(); 
    }
}
