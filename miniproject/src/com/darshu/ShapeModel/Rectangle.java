package com.darshu.ShapeModel;

public class Rectangle implements Shape {
    private int length ,breadth,area;
    public Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public float getArea()
    {
        return length*breadth;

    }
    public String display()
    {
        return "I am Rectangle";
    }


}
