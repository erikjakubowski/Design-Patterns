package builder.pattern;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;
    public Product(){
        parts = new LinkedList<String>();
    }
    public void Add(String str){
        parts.addLast(str);
    }
    public void Show(){
        System.out.println("\nThe product has been completed below: ");
        for(int i = 0; i< parts.size();i++){
            System.out.println(parts.get(i));
        }
    }

}
