package generic.basic;

import java.util.List;

public class GenericMethod {
    public static <E> void genericMethod(List<E> elements){
        for (E e: elements) {
            System.out.println(e.getClass().getName() + " = " + e.toString());
        }

    }

    public static <E> void genericMethodData(E element) {
        System.out.println(element.getClass().getName() + " = " + element.toString());
    }
}
