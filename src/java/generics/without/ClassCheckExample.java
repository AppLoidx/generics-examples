package generics.without;

import java.util.List;

/**
 * @author Arthur Kupriyanov
 */
public class ClassCheckExample {
    private static Object getInstance(Object o){

        // something logic

        return o;
    }

    public static void main(String[] args) {

        String a;
        List list;

        Object obj = getInstance("String");

        if (obj instanceof String){
            a = (String) obj;
        } else if (obj instanceof List){
            list = (List) obj;
        }
    }
}
