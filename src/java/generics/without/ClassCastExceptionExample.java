package generics.without;

import java.util.List;

/**
 * @author Arthur Kupriyanov
 */
public class ClassCastExceptionExample {

    private static Object getInstance(Object o){

        // something logic

        return o;
    }

    public static void main(String[] args) {

        String a = (String) getInstance("String");

        // ClassCastException here...
        List list = (List) getInstance("Another String");
    }

}
