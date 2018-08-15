package com.darshu.ShapeModel;

public class Circle implements Shape {
    private int r;
    private double area;
    public Circle(int r)
    {
        this.r=r;
    }
    public float getArea()
    {
        return 3.14f*r*r;

    }
    public String display()
    {
        return "I am Circle";
    }
 }
