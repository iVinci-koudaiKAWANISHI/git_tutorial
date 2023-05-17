package hard.prob3;
public class Prob3_1{
    public static void main(String[] args) {
        FighterAiracraft fighter = new FighterAiracraft();
        PassengerPlane airlinear = new PassengerPlane();
        fighter.fly();
        fighter.fight();
        airlinear.fly();
        airlinear.carryPassengers();
    }
}