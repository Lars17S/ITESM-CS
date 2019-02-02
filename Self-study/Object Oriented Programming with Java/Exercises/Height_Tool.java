import java.util.Scanner;

class Height_Tool {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Height person = new Height();
    String inputName;
    int inputAge;
    double inputHeight;

    System.out.print("Write your name: ");
    inputName = scanner.nextLine();
    person.setName(inputName);

    System.out.print("Write your age: ");
    inputAge = scanner.nextInt();
    person.setAge(inputAge);
    scanner.nextLine();

    System.out.print("Write your height in cms: ");
    inputHeight = scanner.nextDouble();
    person.setHeight(inputHeight);
    scanner.nextLine();

    System.out.printf("\n\nYour recommended weight is:\n%f", person.getRecommendedWeight());
  }
}
