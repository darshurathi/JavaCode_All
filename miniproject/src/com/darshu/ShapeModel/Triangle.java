package com.darshu.ShapeModel;


public class Triangle implements Shape {
  private int base,height,area;

  public Triangle(int base, int height)
  {
      this.base=base;
      this.height=height;

  }

  public float getArea()
  {

      return (base*height)/2;
  }

  public String display()
  {
      return "I am Triangle";
  }



 }
