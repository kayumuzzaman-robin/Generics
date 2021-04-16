package generic.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("abul", 100.0);
        GenericClass<Employee> genericClass = new GenericClass<>(employee);
        System.out.println("Name: " + genericClass.getObject().getName() + " & Salary: " + genericClass.getObject().getSalary() + "\n");

        GenericClass<Integer> integerGenericClass = new GenericClass<>(500505);
        System.out.println("Value of integerGenericClass = " + integerGenericClass.getObject().toString() + "\n");

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        GenericMethod.genericMethod(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        GenericMethod.genericMethod(integerList);

        GenericMethod.genericMethodData(100);
        GenericMethod.genericMethodData("Hello");
        GenericMethod.genericMethodData(5.55);

        System.out.println();

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle());
        rectangleList.add(new Rectangle());
        BasicWildcard.drawShapes(rectangleList);
    }
}
