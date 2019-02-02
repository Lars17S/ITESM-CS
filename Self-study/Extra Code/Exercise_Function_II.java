import java.util.Scanner;

public class Exercise_Function_II {
  public static void main (String args[]) {
    Scanner stdIn = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    // Declare variable height (integer)
    int height;
    char figure;
    // Ask for the height (here i can ask for the figure)
    System.out.println("What geometric figure do you want to print?");
    System.out.println("a) Triangle\nb) Square\nc) Rectangle");
    System.out.print("Insert a, b or c: ");
    figure = sc.next().charAt(0);
    System.out.print("Insert the height (integer number): ");
    height = stdIn.nextInt();
    switch(figure) {
      case 'a':
        triangle(height);
        break;
      case 'b'
        square(height);
        break;
      case 'c'
        System.out.print("Insert the weight (integer number): ");
        rectangle(height, weight);
        break;
    }
  }
  
  public static void triangle(int height) {
    for (int i = 0; i < height; ++i) {
      for (int j = 0; j < i; ++j)
        System.out.print("x ");
      System.out.println();
    }

  public static void square(int height) {
    for (int i = 0; i < height; ++i)
      for (int j = 0; j < height; ++j)
          System.out.print("x ");
      System.out.println();
  }

  public static void rectangle(int height, int weight) {
    for (int i = 0; i < height; ++i)
      for (int j = 0; j < weight; ++j)
        System.out.print("x ");
      System.out.println();
  }
}
