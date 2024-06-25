package shape;

import shape.Shape;

public class Rectangle extends Shape  {
    private int length,width;

    public Rectangle(int length, int width,String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double) length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "shape.Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color" + getColor()+
                '}';
    }

    public boolean isLengthMultipleOfWidth(){
        return length%width ==0;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
