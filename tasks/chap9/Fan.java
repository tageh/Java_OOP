
public class Fan{
    
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan(){
       speed = SLOW;
       on = false;
       radius = 5;
       color = "blue";
    }

    //Setters
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }

    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    //Getters
    public String getSpeed(){
        String s = "";
        switch(speed){
            case SLOW: s ="SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }

        return s;
    }

    public boolean isOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColors(){
        return color;
    }


    public String toString(){
        if(on == true){
            return "\nFan speed: " + getSpeed() + " color: " +color + " radius: " + radius;
        }
        else{
            return "Fan color: " + color + " radius: " + radius + " the fan is off";
        }
    }


}
