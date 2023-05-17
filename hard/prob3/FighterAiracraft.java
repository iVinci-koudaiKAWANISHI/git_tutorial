package hard.prob3;

public class FighterAiracraft extends AirPlane{
    String type = "戦闘機";
    public void fly() {
        System.out.println("攻撃に出るために飛行します。");
    }
    public void fight() {
        System.out.println("戦闘します。");
    }
}
