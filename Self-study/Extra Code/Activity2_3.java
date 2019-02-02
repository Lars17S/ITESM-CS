import java.util.Scanner;

public class Activity2_3 {
  public static void main (String args[]) {
    Scanner stdIn = new Scanner(System.in);
    // Declare an array of names, number of students and letter
    String[] name;
    int number_Std;
    char letter;
    // Ask the number of students
    System.out.print("How many students are there? ");
    number_Std = stdIn.nextInt();
    name = new String[number_Std];
    stdIn.nextLine();
    // Write the names into array
    for (int i = 0; i < name.length; ++i) {
      System.out.printf("Student[%d] name: ", i + 1);
      name[i] = stdIn.nextLine();
    }
    // Ask for the first letter
    System.out.println("Insert a letter to find the students which name starts with input letter");
    System.out.print("Letter: ");
    letter = stdIn.next().charAt(0);
    // Check possible error
    if (Character.isLowerCase(letter))
      letter = Character.toUpperCase(letter);
    // For each name, find which names starts with letter and print them
    for (String word : name) {
      if (word.indexOf(letter) == 0)
        System.out.printf("%s ", word);
    }
  }
}
