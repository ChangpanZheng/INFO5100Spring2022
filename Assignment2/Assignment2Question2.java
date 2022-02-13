public class Assignment2Question2 {
    public static void main(String[] args) {

    }
}

class Shape {
    private String name;
    private String color;
    private double perimeter;
    private double area;

    public Shape() {
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double perimeter, double area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void printShape() {
        System.out.println("The shape is " + this.getName());
    }

    public double getArea() {
        return this.getArea();
    }

    public double getPerimeter() {
        return this.getPerimeter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double side) {
        this.base = side;
        this.height = Math.pow(3, 0.5) * base / 2;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(double diagonal) {
        this.diagonal1 = diagonal;
        this.diagonal2 = diagonal;
    }

    @Override
    public double getArea() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.sqrt(diagonal1 * diagonal1 + diagonal2 * diagonal2);
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
}

