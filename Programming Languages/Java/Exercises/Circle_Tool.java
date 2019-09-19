import java.util.Scanner;

class Circle_Tool {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle();
    double inputRadius;

    System.out.print("Input the outer radius: ");
    inputRadius = scanner.nextDouble();
    circle.setOuterRadius(inputRadius);
    scanner.nextLine();

    System.out.print("Input the inner radius: ");
    inputRadius = scanner.nextDouble();
    circle.setInnerRadius(inputRadius);
    scanner.nextLine();

    System.out.printf("The shaded area is: %f\n", circle.getShadedArea());
    System.out.printf("The total circumference is: %f", circle.getCircumference());
  }
}
