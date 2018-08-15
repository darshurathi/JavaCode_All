package com.darshu;

import com.darshu.ShapeCreator.ShapeCreator;
import com.darshu.ShapeModel.Shape;

public class ShapeProgram {
    public void run() {

        ShapeType type;
        while (true) {
            type = getInput();
            ShapeCreator shapeCreator = new ShapeCreator();
            Shape shape = shapeCreator.createShape(type);

            System.out.println("Display: " + shape.display());
            System.out.println("Shape area: " + shape.getArea() );

        }
    }
    private ShapeType getInput() {
        ShapeType type = null;
        System.out.println(" 1. Triangle");
        System.out.println(" 2. Rectangle");
        System.out.println(" 3. Square");
        System.out.println(" 4. Circle");
        System.out.println(" 5. SemiCircle");
        System.out.println(" Enter Your Choice .....");
        int x = new java.util.Scanner(System.in).nextInt();

        switch (x) {
            case 1:
                type = ShapeType.TRIANGLE;
                break;
            case 2:
                type = ShapeType.RECTANGLE;
                break;
            case 3:
                type = ShapeType.SQUARE;
                break;
            case 4:
                type = ShapeType.CIRCLE;
                break;
            case 5:
                type = ShapeType.SEMICIRCLE;
            default:
                System.out.println("INVALID CHOICE");
        }
        return type;
    }
}
