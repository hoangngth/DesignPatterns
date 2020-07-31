package Behavioral.ChainOfResponsibility;

public class Director implements Chain {
    
    @Override
    public void setNextChain(Chain nextChain) {}

    @Override
    public void approve(AbsentRequest request) {
        if (request.getDaysAbsent() <= 7) {
            System.out.println("Director approve this.");
        } else {
            System.out.println("You are not allow to absent this many days!");
        }
    }

}