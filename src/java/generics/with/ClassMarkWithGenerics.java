package generics.with;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Arthur Kupriyanov
 */
public class ClassMarkWithGenerics {
    private <T> T getFoo(Class<T> tClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       return tClass.getConstructor(String.class).newInstance("something init arg");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ClassMarkWithGenerics classMarkWithGenerics = new ClassMarkWithGenerics();

        String s = classMarkWithGenerics.getFoo(String.class);

        System.out.println(s);  // output something init arg


        // With custom class

        MyClass myClass = classMarkWithGenerics.getFoo(MyClass.class);

        myClass.printField();   // Field value : something init arg

    }
}


class MyClass {
    private String field;

    public MyClass(String arg){
        this.field = arg;
    }

    void printField(){
        System.out.println("Field value : " + field);
    }
}
