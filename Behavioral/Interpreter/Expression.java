package Behavioral.Interpreter;

public abstract class Expression {
    
    public void interpret(Context context) {

        switch (context.getInput()) {
            case 1:
                context.setOutput(one());
                break;
            case 2:
                context.setOutput(two());
                break;
            case 3:
                context.setOutput(three());
                break;
            case 4:
                context.setOutput(four());
                break;
            case 5:
                context.setOutput(five());
                break;
            case 6:
                context.setOutput(six());
                break;
            case 7:
                context.setOutput(seven());
                break;
            case 8:
                context.setOutput(eight());
                break;
            case 9:
                context.setOutput(nine());
                break;
            default:
                System.out.println("Not a number 0-9");
        }
    }

    public abstract String one();
    public abstract String two();
    public abstract String three();
    public abstract String four();
    public abstract String five();
    public abstract String six();
    public abstract String seven();
    public abstract String eight();
    public abstract String nine();
}