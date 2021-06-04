class ComparableSphere extends Sphere implements Comparable<ComparableSphere>{

    ComparableSphere(double radius){
        super(radius);
    }
    
    @Override
    public int compareTo(ComparableSphere obj){
        if(super.calculateVolume() > obj.calculateVolume()){
            return 1;
        }else if(super.calculateVolume() < obj.calculateVolume()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
