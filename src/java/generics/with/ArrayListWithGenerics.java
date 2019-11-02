package generics.with;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Arthur Kupriyanov
 */
public class ArrayListWithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Something string");
        // list.add(new HashMap());     we can't do this

        for (String s: list
             ) {
            // We don't need to cast variable
            // see ArrayListWithoutGenerics.java

            System.out.println(s);
        }
    }
}
