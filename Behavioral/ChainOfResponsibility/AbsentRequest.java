package Behavioral.ChainOfResponsibility;

public class AbsentRequest {
    
    private int daysAbsent;

    public AbsentRequest(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    public int getDaysAbsent() {
        return this.daysAbsent;
    }
}