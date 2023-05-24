package hard.prob4;
public class Prob4_1{
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
    public static void funcPhone(IPhone phone){
        phone.callPhone();
        phone.recievePhone();
    }
    public static void funcMailer(IMailer mailer){
        mailer.sendMail();
        mailer.recieveMail();
    }
    public static void funcComputer(IComputer computer){
        computer.playGame();
        computer.borwseWeb();
    }
}