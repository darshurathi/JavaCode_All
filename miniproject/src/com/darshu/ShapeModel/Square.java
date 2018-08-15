package com.darshu.ShapeModel;

public class Square implements Shape {
    private int side,area;
    public Square(int side)
    {
        this.side=side;
    }
    public float getArea()
    {

        return side*side;

    }
    public String display()
    {
        return "I am Square";    }

}
