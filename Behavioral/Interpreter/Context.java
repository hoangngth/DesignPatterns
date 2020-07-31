package Behavioral.Interpreter;

public class Context {

    private int input;
    private String output;

    public Context(int input) {
        this.setInput(input);
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

}