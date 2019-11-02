package generics.with;

import java.util.ArrayList;

/**
 * @author Arthur Kupriyanov
 */
public class MethodWithGeneric {
    private <T> T  getFoo(T object){
        return object;
    }


    public static void main(String[] args) {
        MethodWithGeneric mwg = new MethodWithGeneric();

        String a = mwg.getFoo("Stirng");
        ArrayList list = mwg.getFoo(new ArrayList());

        // Set set = mwg.getFoo("Incompatible types");

    }
}
