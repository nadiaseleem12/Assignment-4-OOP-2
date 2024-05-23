package shape;

abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return "shape.Shape{" +
                "color='" + color + '\'' +
                '}';
    }


}
