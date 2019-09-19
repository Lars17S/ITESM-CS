import java.util.Scanner;

class BinarySearch {
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);
    int[] number;
    int v, p, r, i;
    int length;
    int position;

    System.out.print("How many numbers in the array?: ");
    length = scanner.nextInt();
    number = new int[length];
    p = 0;
    r = number.length - 1;
    scanner.nextLine();

    System.out.print("Write the numbers (positive integers) from smaller to bigger (sorted)");
    for (int j = 0; j < number.length; ++j) {
      System.out.printf("Number [%d]: ", j + 1);
      number[j] = scanner.nextInt();
      scanner.nextLine();
    }

    System.out.print("Write the number that you want to find: ");
    v = scanner.nextInt();
    scanner.nextLine();

    position = BinarySearchTool(number, p, r, v);
    if (position == -1)
      System.out.print("Element not present");
    else
      System.out.printf("Element present in the position: %d", position + 1);
  }

  public static int BinarySearchTool (int[] A, int p, int r, int v) {
    int i = (p + r) / 2;
    while (p < r) {
      if (v < A[i])
        r = i;
      else if (v == A[i])
        return i;
      else
        p = i + 1;
      i = (p + r) / 2;
    }
    return -1;
  }
}
