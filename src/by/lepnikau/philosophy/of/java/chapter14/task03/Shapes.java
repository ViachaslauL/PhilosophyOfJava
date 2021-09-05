package by.lepnikau.philosophy.of.java.chapter14.task03;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    public void rotate() {
        if (!(this instanceof Circle)) {
            System.out.println("Shape is rotated");
        } else {
            System.out.println("Circle can't be rotate");
        }
    }

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {


    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape{
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
            shape.draw();
        }

        Rhomboid rhomboid = (Rhomboid) shapeList.get(3);
        rhomboid.draw();

        Shape shape = shapeList.get(0);

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.draw();
            circle.rotate();
        } else {
            System.out.println("Can't cast to Circle");
        }
    }

    public static Circle getCircle() {
        return new Circle();
    }
}
