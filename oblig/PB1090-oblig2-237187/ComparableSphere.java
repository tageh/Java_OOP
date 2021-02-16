public class ComparableSphere extends Sphere implements Comparable<ComparableSphere>{

    public ComparableSphere(double radius){
        super(radius);
    }

    @Override
    public int compareTo(ComparableSphere obj){
        if(super.calculateVolume() > obj.calculateVolume()){
            return 1; //1 is True
        }else if(calculateVolume() < obj.calculateVolume()){
            return -1;
        }
        return 0; //0 is false
    }

    @Override
    public String toString(){
       return "Volum: "+ calculateVolume(); 
    }
}
