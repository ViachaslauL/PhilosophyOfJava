package by.lepnikau.philosophy.of.java.chapter14.task06;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    protected boolean flag = false;

    public Shape() {
    }

    public Shape(boolean flag) {
        this.flag = flag;
    }

    void draw() {
        System.out.println(this + ".draw()" + "\nFlag: " + flag);
    }

    abstract public String toString();
}

class Circle extends Shape {
    public Circle() {
    }

    public Circle(boolean flag) {
        super(flag);
    }

    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public Square() {
    }

    public Square(boolean flag) {
        super(flag);
    }

    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(boolean flag) {
        super(flag);
    }

    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public Rhomboid() {
    }

    public Rhomboid(boolean flag) {
        super(flag);
    }

    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(true),
                new Square(),
                new Triangle(true),
                new Rhomboid()
        );
        for (Shape shape : shapeList) shape.draw();
    }

    public static Circle getCircle() {
        return new Circle();
    }

}
