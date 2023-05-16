package basic.prob6;

public class Minmax {
    public int max(int n1,int n2,int n3){
        return Math.max(Math.max(n1, n2),n3);
    }
    public int min(int n1,int n2,int n3){
        return Math.min(Math.min(n1, n2),n3);
    }
}
