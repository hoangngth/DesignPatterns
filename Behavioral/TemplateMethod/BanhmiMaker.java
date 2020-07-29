package Behavioral.TemplateMethod;

public class BanhmiMaker {
    
    public static void main(String[] args) {

        BanhmiTemplate banhmi1 = new BanhmiChay();
        banhmi1.makeBanhmi();

        BanhmiTemplate banhmi2 = new BanhmiThitKhongOt();
        banhmi2.makeBanhmi();
    }
}