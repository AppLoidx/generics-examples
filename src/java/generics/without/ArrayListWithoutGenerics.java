package generics.without;

import java.util.ArrayList;

/**
 * @author Arthur Kupriyanov
 */
public class ArrayListWithoutGenerics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("String");
        arrayList.add(new ArrayList());

        for (Object obj: arrayList
             ) {
            String a = (String) obj;

            // ClassCastException on second iteration
        }
    }
}
