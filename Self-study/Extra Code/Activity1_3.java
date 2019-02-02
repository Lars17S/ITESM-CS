/* Write a program that asks a number to the user and determines the perfect numbers existing
between 1 and the given number. */

public class Activity1_3 {
  public static void main (String args[]) {
    // Declaration of input long number
    long input_Num;
    // Ask for input_Num
    System.out.print("Insert an integer number: ");
    input_Num = Integer.parseInt(System.console().readLine());
    // Check for each number until input_Num
    System.out.println("|Perfect numbers|");
    for (long i = 2; i <= (long)input_Num; ++i)
        // Calls perfect_Num function, if it's true, print the number.
        if (perfect_Num(i) == true)
          System.out.printf("%d ", i);
  }

  // Function to check if the current i number is a perfect number.
  public static boolean perfect_Num (long i) {
    // Declaration of sum
    long sum = 1;
    // Check for each number j until sqrt i
    for (int j = 2; j < Math.sqrt(i); ++j)
      // If j is a factor, then add j + i/j to sum.
      // NOTE: i/j due division form (i/j = c + r/j), i/j is a factor too.
      if (i % j == 0)
        sum = sum + j + i/j;

    if (i == sum) return true;

    return false;
  }
}
