import java.util.Scanner;

public class Exercise3_1 {
  public static void main (String args[]) {
    // Declare the variables
    Scanner scanner = new Scanner(System.in);
    int student_Num;
    String[] student;
    char letter;
    // Ask for the number of students and their names
    System.out.print("How many students are there in the classroom?: ");
    student_Num = Integer.parseInt(System.console().readLine());
    student = new String[student_Num];
    // Ask for the names
    for (int i = 0; i < student.length; ++i) {
      System.out.print("Name: ");
      student[i] = scanner.next();
    }
    // Ask for the special letter
    System.out.println("Insert a capital letter to find the student(s) with the input letter" +
    "at the beginning of name");
    System.out.print("Letter: ");
    letter = scanner.next().charAt(0);
    // Use for each word indexOf("a") == 0 for print the String
    for(String word : student)
      if (word.indexOf(letter) == 0)
        System.out.printf("%s ", word);
  }
}
