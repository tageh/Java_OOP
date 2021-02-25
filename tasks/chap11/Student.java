public class Student extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    Student(String name, String adress, int phonerNr, String email, int status){
        super(name, adress, phonerNr ,email);
        this.status = status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getStatus(){
        switch(status){
            case 1: return "Fresman";
            case 2: return "Junior";
            case 3: return "Sophmore";
            case 4: return "Senior";
            default: return "Unknown"; 
        }
    }

    public String toString(){
        return super.toString() + " Status: "+ getStatus();
    }


}
