package hard.prob3;
public class Prob3_1{
    public static void main(String[] args) {
        FighterAircraft fighter = new FighterAircraft();
        PassengerPlane airliner = new PassengerPlane();
        fighter.fly();
        fighter.fight();
        airliner.fly();
        airliner.carryPassengers();
    }
}