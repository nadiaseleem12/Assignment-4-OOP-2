package shape;

import shape.Shape;

public class Rectangle extends Shape {
    private int length,width;
    @Override
    public double getArea() {
        return length*width;
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

    public Rectangle(int length, int width,String color) {
        super(color);
        this.length = length;
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

}
