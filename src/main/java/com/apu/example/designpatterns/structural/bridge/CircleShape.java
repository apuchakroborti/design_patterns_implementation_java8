package com.apu.example.designpatterns.structural.bridge;

/*
* The Bridge design pattern is a structural design pattern that divides an object's interface from its implementation.
* The intent of the Bridge pattern is to decouple an abstraction from its implementation so that the two can vary independently.

In the example I provided, the DrawingAPI interface defines the methods for drawing circles.
The DrawingAPI1 and DrawingAPI2 classes are concrete implementations of the DrawingAPI interface.

The Shape abstract class is the "abstraction" in the pattern, and it has a reference to a DrawingAPI object.
The CircleShape class is a concrete implementation of the Shape class, and it also has a reference to a DrawingAPI object.

The draw method in the Shape class is the "bridge" between the abstraction (Shape) and the implementation (DrawingAPI).
The resizeByPercentage method is an example of a high-level operation (part of the abstraction) that does not depend on the implementation.

By using the Bridge design pattern, you can change the drawing API used by a shape without having to modify the shape's code.
For example, you could create a new drawing API called DrawingAPI3 and use it to draw circles as follows:
*
*
*
*
* */
public class CircleShape extends Shape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;  this.y = y;  this.radius = radius;
    }

    // low-level i.e. Implementation specific
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
    // high-level i.e. Abstraction specific
    public void resizeByPercentage(double pct) {
        radius *= (1.0 + pct/100.0);
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, new DrawingAPI1()),
                new CircleShape(5, 7, 11, new DrawingAPI2())
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }


        /*
        * This would allow you to draw the circles using the DrawingAPI3 implementation without modifying the CircleShape class.
        *
        In the example I provided, the draw method in the Shape abstract class is the "bridge" between the abstraction (Shape) and the implementation (DrawingAPI).
        The draw method is defined in the Shape class,
        but it delegates the actual drawing to the DrawingAPI object that is referenced by the drawingAPI field in the Shape class.
        This allows the Shape class to be independent of the concrete implementation of the DrawingAPI interface,
        and the DrawingAPI implementation can be changed without affecting the Shape class.
        *
        * */

    }
}