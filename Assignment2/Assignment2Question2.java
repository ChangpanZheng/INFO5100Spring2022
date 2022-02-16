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
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
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


    public Triangle(double base, double height) {
        // we regard this as isosceles triangle
        this.setName("Triangle");
        this.setBase(base);
        this.setHeight(height);
    }

    public Triangle(double side) {
        // we regard this as equilateral triangle
        this.setName("Triangle");
        this.setBase(side);
        this.setHeight(Math.sqrt(3) * base / 2);
    }

    @Override
    public double getArea() {
        this.setArea(this.getBase() * this.getHeight() / 2);
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        this.setPerimeter(2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2)) + getBase());
        return super.getPerimeter();
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
        this.setName("Rhombus");
        this.setDiagonal1(diagonal1);
        this.setDiagonal2(diagonal2);
    }

    public Rhombus(double diagonal) {
        this.setName("Rhombus");
        this.setDiagonal1(diagonal);
        this.setDiagonal2(diagonal);
    }

    @Override
    public double getArea() {
        super.setArea(this.getDiagonal1() * this.getDiagonal2() / 2);
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        super.setPerimeter(2 * Math.sqrt(Math.pow(this.getDiagonal1(), 2) + Math.pow(this.getDiagonal2(), 2)));
        return super.getPerimeter();
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

