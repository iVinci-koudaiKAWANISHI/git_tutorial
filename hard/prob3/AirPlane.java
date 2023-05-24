package hard.prob3;

public abstract class AirPlane {
    public abstract void fly();
    public String type;
    AirPlane(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}