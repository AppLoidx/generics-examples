package generics.with;

import java.lang.reflect.Method;
import java.util.Comparator;

/**
 * @author Arthur Kupriyanov
 */
public class BridgeMethods implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }

    // Bridge method:

    //  public int compare(Object o1, Object o2){
    //      return compare((Integer)a, (Integer)b);
    //  }


    public static void main(String[] args) {
        for (Method m : BridgeMethods.class.getMethods()
             ) {
            if (m.isSynthetic()){
                System.out.println("method: " + m.getName());

                System.out.print("arg types: ");
                for (Class c: m.getParameterTypes()) {
                    System.out.print(c.getName() + " ");
                }
                System.out.println();
                System.out.println("return type: " + m.getReturnType().getName());
            }
        }
    }
}

/*
Output:

method: compare
arg types: java.lang.Object java.lang.Object
return type: int

 */
