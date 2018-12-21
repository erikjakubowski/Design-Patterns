package proxy.pattern.proxy.classes;

/**
 * Provide a surrogate or placeholder for another object to control access to it.
 */

public class ProxyPatternMain {
    public static void main(String[]args){
        System.out.println("**** Proxy System Demo ****");
        Proxy proxy = new Proxy();
        proxy.doSomeWork();
    }
}
