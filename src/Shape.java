abstract class Shape {
abstract double calculateArea();
}
class circle extends Shape{
    private double radius;

    public circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea(){
        return length * width;
    }
}
class triangle extends Shape{
    private double base, height;

    public triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea(){
        return 0.5 * base * height;
    }
}

