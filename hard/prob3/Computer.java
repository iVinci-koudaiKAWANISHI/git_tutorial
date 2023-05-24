package hard.prob3;

public abstract class Computer {
    private String type;
    public Computer(String type){
        this.type = type;
    }
    public void showType() {
        System.out.println("コンピューターの種類：" + type);
    }
    public abstract void input();
    public abstract void output();
    public void communication() {
        System.out.println("インターネットで通信");
    }
}
