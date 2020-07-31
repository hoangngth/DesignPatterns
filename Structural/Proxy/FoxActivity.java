package Structural.Proxy;

public class FoxActivity {
    
    public static void main(String[] args) {

        ProxyFox proxyFox = new ProxyFox("Roxy");

        System.out.println("First fox call out: ");
        proxyFox.play();

        System.out.println("-------------------");
        System.out.println("Second fox call out: ");
        proxyFox.play();

    }
}