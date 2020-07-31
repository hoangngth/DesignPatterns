package Behavioral.ChainOfResponsibility;

public interface Chain {
    void setNextChain(Chain nextChain);
    void approve(AbsentRequest request);
}