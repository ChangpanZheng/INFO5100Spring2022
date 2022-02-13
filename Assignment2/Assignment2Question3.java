import org.w3c.dom.ls.LSOutput;

public class Assignment2Question3 {
    public static void main(String[] args) {

    }
}

class shapeTester {
    public static void main(String args[]) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);

        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}


class Shape {
    private String name;
    private double area;
    private double perimeter;

    public Shape() {
    }

    public void display() {
        System.out.println("=============== Shape Detail ===============");
        System.out.println("Name : " + this.getName());
        System.out.println("Area : " + this.getArea());
        System.out.println("Perimeter : " + this.getPerimeter());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        System.out.println(length * width);
    }

    public void computePerimeter() {
        System.out.println(2 * (length + width));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        System.out.println(Math.pow(radius, 2) * Math.PI);
    }

    public void computePerimeter() {
        System.out.println(2 * Math.PI * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
