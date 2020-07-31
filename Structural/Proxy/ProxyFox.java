package Structural.Proxy;

public class ProxyFox implements Fox {

    private Fox realFox;
    private String name;

    public ProxyFox(String name) {
        this.name = name;
    }
    
    @Override
    public void play() {
        if (realFox == null) {
            System.out.printf("< The fox is not playing. Bring out new fox %s >\n", this.name);
            realFox = new RealFox(this.name); // calling Real class is expensive and only be access when necessary
        } else {
            System.out.println("< The fox is already playing >");
        }
        realFox.play();
    }
    
}