package hard.prob3;
public class Prob3_1{
    public static void main(String[] args) {
        FighterAircraft fighter = new FighterAircraft();
        PassengerPlane airliner = new PassengerPlane();
        System.out.print(fighter.getType() + ":");
        fighter.fly();
        fighter.fight();
        System.out.print(airliner.getType() + ":");
        airliner.fly();
        airliner.carryPassengers();
    }
}