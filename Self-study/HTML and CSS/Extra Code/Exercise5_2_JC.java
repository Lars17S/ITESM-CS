public class Exercise5_2_JC {
  public static void main(String args[]) {
    long input_Num;
    int final_Num;

    System.out.print("Insert your number: ");
    input_Num = Integer.parseInt(System.console().readLine());
    final_Num = (int)input_Num;
    System.out.printf("Your number is: %d", final_Num);
  }
}
