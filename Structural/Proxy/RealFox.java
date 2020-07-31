package Structural.Proxy;

public class RealFox implements Fox {

    private String name;

    public RealFox(String name) {
        this.name = name;
        /*
        **  This constructor should be larger and has a lot more logics.
        */
    }

    @Override
    public void play() {    
        System.out.printf("Call %s the fox!\n", name);
        /*
        **  This method should be larger and has a lot more logics.
        */
    }
    
}