package Behavioral.ChainOfResponsibility;

public class AbsentProcedure {
    
    public static void main(String []args) {

        Chain leader = new Leader();
        Chain projectManager = new ProjectManager();
        Chain director = new Director();

        leader.setNextChain(projectManager);
        projectManager.setNextChain(director);

        System.out.println("Absent Request #1");
        AbsentRequest absentRequest1 = new AbsentRequest(4);
        leader.approve(absentRequest1);

        System.out.println("-----------------");
        System.out.println("Absent Request #2");
        AbsentRequest absentRequest2 = new AbsentRequest(10);
        leader.approve(absentRequest2);
    }
}