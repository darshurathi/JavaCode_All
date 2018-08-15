package com.darshu.ShapeCreator;

import com.darshu.ShapeModel.*;
import com.darshu.ShapeType;

public class ShapeCreator {

    public ShapeCreator() {

    }
    public Shape createShape(ShapeType type) {
        switch (type) {
            case TRIANGLE:
                return createTriangleShape();

            case RECTANGLE:
                return createRectangleShape();

            case SQUARE:
                return createSquareShape();

            case CIRCLE:
                return createCircleShape();
        }
        return null;
    }

    private Shape createTriangleShape() {
        System.out.println("Enter height and base: ");
        int h = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        return new Triangle(h, b);
    }

    private Shape createRectangleShape() {
        System.out.println("Enter width and height: ");
        int w = new java.util.Scanner(System.in).nextInt();
        int h = new java.util.Scanner(System.in).nextInt();
        return new Rectangle(w, h);
    }

    private Shape createSquareShape() {
        System.out.println("Enter side: ");
        int s = new java.util.Scanner(System.in).nextInt();
        return new Square(s);
    }

    private Shape createCircleShape() {
        System.out.println("Enter radius: ");
        int r = new java.util.Scanner(System.in).nextInt();
        return new Circle(r);
    }
    private Shape createSemiCircleShape(){
        System.out.println("Enter radius :");
        int s = new java.util.Scanner(System.in).nextInt();
        return new SemiCircle(s);
    }
}
