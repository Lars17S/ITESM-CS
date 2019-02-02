import java.util.Scanner;
public class Homework_II
{	
	public static void main(String[] arg)
	{
		Scanner stdIn = new Scanner(System.in);
		int input_number = 0;
		int first_digit, second_digit, third_digit;
		String hundred_number[] = {"One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", 
		"Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};
		String ten_number[] = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String name_number[] = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
		"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		System.out.print("Welcome to National Bank | Please insert your amount (up to 3 digits)\n");
		System.out.print("Amount: $");
		// Read the number
		input_number = stdIn.nextInt(); 
		
		//Error
		if (input_number >= 1000)
		{
			System.out.print("\nERROR: You can enter a number of up to 3 digits");
			System.exit(0);
		}
		
		// Separate the numbers
		first_digit = input_number % 10;
		second_digit = (input_number / 10) % 10;
		third_digit = input_number / 100;

		// OUTPUT
		System.out.print("\nResult: ");
		
		switch (third_digit)
		{
		case 0: break;
		
		case 1: System.out.print(hundred_number[0]); break;
		case 2: System.out.print(hundred_number[1]); break;
		case 3: System.out.print(hundred_number[2]); break;
		case 4: System.out.print(hundred_number[3]); break;
		case 5: System.out.print(hundred_number[4]); break;
		case 6: System.out.print(hundred_number[5]); break;
		case 7: System.out.print(hundred_number[6]); break;
		case 8: System.out.print(hundred_number[7]); break;
		case 9: System.out.print(hundred_number[8]); break;
		}
		if (third_digit != 0)
			System.out.print(' ');
		
		switch(second_digit)
		{
		case 0:	break;
		case 1:
			switch(first_digit)
			{
			case 0: System.out.print(name_number[10]); break;
			case 1: System.out.print(name_number[11]); break;
			case 2: System.out.print(name_number[12]); break;
			case 3: System.out.print(name_number[13]); break;
			case 4: System.out.print(name_number[14]); break;
			case 5: System.out.print(name_number[15]); break;
			case 6: System.out.print(name_number[16]); break;
			case 7: System.out.print(name_number[17]); break;
			case 8: System.out.print(name_number[18]); break;
			case 9: System.out.print(name_number[19]); break;
			}
			System.exit(0);
			break;
		case 2: System.out.print(ten_number[0]); break;
		case 3: System.out.print(ten_number[1]); break;
		case 4: System.out.print(ten_number[2]); break;
		case 5: System.out.print(ten_number[3]); break;
		case 6: System.out.print(ten_number[4]); break;
		case 7: System.out.print(ten_number[5]); break;
		case 8: System.out.print(ten_number[6]); break;
		case 9: System.out.print(ten_number[7]); break;
		}
		
		if (second_digit != 0)
			System.out.print(' ');
		
		switch(first_digit)
		{
		case 0: break;
		case 1: System.out.print(name_number[1]); break;
		case 2: System.out.print(name_number[2]); break;
		case 3: System.out.print(name_number[3]); break;
		case 4: System.out.print(name_number[4]); break;
		case 5: System.out.print(name_number[5]); break;
		case 6: System.out.print(name_number[6]); break;
		case 7: System.out.print(name_number[7]); break;
		case 8: System.out.print(name_number[8]); break;
		case 9: System.out.print(name_number[9]); break; 
		}
		
		// When all digits are equal to zero
		if (first_digit == 0 && second_digit == 0 && third_digit == 0)
			System.out.print(name_number[0]);
	}
}