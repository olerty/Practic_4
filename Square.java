package com.company;

public class Square extends Rectangle{
    public Square(double width, double length, String color, boolean filled){
        super(width, length, color, filled);
    }

    public Square(double width, double length){
        super(width, length);
    }

    public Square(){}

    @Override
    public double getWidth() {return super.getWidth();}
    @Override
    public void setWidth(double width) {super.setWidth(width);}

    @Override
    public double getLength() {return super.getLength();}
    @Override
    public void setLength(double length) {super.setLength(length);}

    @Override
    public double getArea() {return super.getArea();}
    @Override
    public double getPerimeter() {return super.getPerimeter();}

    @Override
    public String toString() {return super.toString();}
}
