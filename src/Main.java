import java.util.Scanner;

public class ShapeCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1 = Circle");
        System.out.println("2 = Rectangle");
        System.out.println("3 = Triangle");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        Shape shape = null;
        switch (choice){
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(lengrh, width);
                break;

            case 3:
                System.out.print("Enter base of the triangle");

        }
    }
}