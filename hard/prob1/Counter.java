package hard.prob1;

public class Counter {
    private int count = 0;
    private static int totalCount = 0;
    public void count() {     
        count++;
        totalCount ++;    
    }
    public void reset() {
        totalCount -= count;
        count = 0;
    }
    public int getCount() {
        return count;
    }
    public static int getTotalCount(){
        return totalCount; 
    }
}
