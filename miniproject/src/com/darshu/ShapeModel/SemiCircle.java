package com.darshu.ShapeModel;

public class SemiCircle {
    private int r;
    public SemiCircle(int r)
    {
        this.r=r;
    }

    public float getArea()
    {
        return (3.14f*r*r)/2;
    }
}
