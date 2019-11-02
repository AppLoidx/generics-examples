package generics.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthur Kupriyanov
 */
public class First {
    public static void main(String[] args) {

        List<? extends Number> numbers = new ArrayList<>();
        // numbers = new ArrayList<Integer>();
        // numbers = new ArrayList<Long>();

        // Можно добавить только null

        // numbers.add(23);    // error
        // numbers.add(23L);   // error

        numbers.add(null);
    }

    private void someFunc(List<? extends Number> numbers){
        // numbers.add(1999L);
    }
}
