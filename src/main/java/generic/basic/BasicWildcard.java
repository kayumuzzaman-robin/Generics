package generic.basic;

import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("This is Circle");
    }
}

public class BasicWildcard {
    public static void drawShapes(List<? extends Shape> list) {
        for (Shape shape : list) {
            shape.draw();
        }
    }
}
