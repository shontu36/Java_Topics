package Concurrency3.AdderSubtractorSyncMethods;

public class Value {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public synchronized void incrementBy(int x){
        val += x;
    }
}
