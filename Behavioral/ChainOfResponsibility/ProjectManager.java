package Behavioral.ChainOfResponsibility;

public class ProjectManager implements Chain {
    
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void approve(AbsentRequest request) {
        if (request.getDaysAbsent() <= 5) {
            System.out.println("Project Manager approve this.");
        } else {
            System.out.println("Project Manager does not have the permission. Pass to the next.");
            nextChain.approve(request);
        }
    }

}