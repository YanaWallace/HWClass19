package HWClass19;

public class Shape {
    int length;
    int width;
}

class Rectangle extends Shape {
    public void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Square extends Shape {
    public void calculateArea() {
        System.out.println("Area of Square: " + (length * length));
    }
}


