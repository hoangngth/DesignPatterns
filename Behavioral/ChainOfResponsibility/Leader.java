package Behavioral.ChainOfResponsibility;

public class Leader implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void approve(AbsentRequest request) {
        if (request.getDaysAbsent() <= 3) {
            System.out.println("Leader approve this.");
        } else {
            System.out.println("Leader does not have the permission. Pass to the next.");
            nextChain.approve(request);
        }
    }
    
}