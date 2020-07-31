package Behavioral.Interpreter;

public class Translator {
    
    public static void main(String[] args) {

        Context context = new Context(1);
        Expression germanExpression = new GermanExpression();
        germanExpression.interpret(context);
        System.out.println(context.getOutput());
    }
}