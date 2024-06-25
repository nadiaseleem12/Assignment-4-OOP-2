package shape;

import medical.Doctor;

public class Main {
    public static void main(String[] args) {


        Doctor doctor = new Doctor();
        doctor.makeCPR();


//        Rectangle rectangle = new Rectangle(10, 5, "Blue");
//        Triangle triangle = new Triangle(6, 10, "Red");

        Shape[] shapes = new Shape[10];

        shapes[0] = new Rectangle(10, 5, "Blue");
        shapes[1] = new Triangle(10, 5, "Blue");

        for (Shape shape : shapes) {
            if (shape != null)
               drawShape(shape);
        }

        Object [] objects = new Object[5];
        objects[0] =  Integer.valueOf(5);
        objects[1] = new String("mnb");

    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }

    public static boolean checkIfRectangleLengthMultipleOfWidth(Shape shape){
        if (! (shape instanceof Rectangle))
            return false;
        Rectangle rect = (Rectangle) shape;
        return rect.isLengthMultipleOfWidth();

    }

}