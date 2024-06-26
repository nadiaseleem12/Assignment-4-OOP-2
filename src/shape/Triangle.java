package shape;

import shape.Shape;

public class Triangle extends Shape implements ShapeInterface {
    private int base,height;

    public Triangle( int base, int height,String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (base * height) /2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", color="+getColor()+
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Draw a Triangle");
    }
}
