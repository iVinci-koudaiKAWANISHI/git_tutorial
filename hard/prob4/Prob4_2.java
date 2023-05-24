package hard.prob4;

public class Prob4_2 {
    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock();
        funcAlarm(ac);
        funcClock(ac);
    }
    public static void funcAlarm(IAlarm alarm){
        alarm.setAlarm();
        alarm.alarm();
        alarm.stopAlarm();
    }
    public static void funcClock(IClock clock){
        clock.adjustTime();
        clock.showTime();
    }
}
