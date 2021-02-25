public class Person{
    private String name;
    private String adress;
    private int phonerNr;
    private String email;

    Person(){
    }

    Person(String name, String adress, int phonerNr, String email){
        this.name = name;
        this.adress = adress;
        this.phonerNr = phonerNr;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }

    public int getPhoneNr(){
        return phonerNr;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setPhoneNr(int phonerNr){
        this.phonerNr = phonerNr;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Person name: "+name +" adress: " + adress + "phone number: " +phonerNr + "email adress: " +email;
    }


}
