package generics.with;

import java.util.ArrayList;

/**
 * @author Arthur Kupriyanov
 */
public class MethodWithStaticReturnType<T> {
    private String getFoo(T object){
        return "Received object " + object.toString();
    }


    public static void main(String[] args) {
        MethodWithStaticReturnType<String> mwgString = new MethodWithStaticReturnType<>();
        MethodWithStaticReturnType<ArrayList> mwgList = new MethodWithStaticReturnType<>();

        print(mwgString.getFoo("Receive only strings"));

        // print(mwgList.getFoo("Receive only List"));

        print(mwgList.getFoo(new ArrayList()));


        // but returns only String
    }

    private static void print(String s){
        System.out.println(s);
    }
}
