package singleton.pattern;

/**
 * Ensure a class only has one instance, and provide a global point of access to it.
 */

public class SingletonPatternMain {
    public static void main(String [] args){
        System.out.println("**** Singleton Demo ****");
        System.out.println("Ready for Production");
        ProductionVersion prod1 = ProductionVersion.get_prodVersion();
        System.out.println("Redeploy Production code");
        ProductionVersion prod2 = ProductionVersion.get_prodVersion();
        if (prod1 == prod2){
            System.out.println("These are the same instances");
        }
    }
}
