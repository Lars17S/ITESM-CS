import java.util.Scanner;

public class HomeworkI_1 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int coin[] = new int[4];
		int product_price[] = new int[5];
		int product_number[] = new int[5];
		int input_code, input_quantity;
		char exit_menu;
		int price_chips = 8;
		int price_chocolate = 12;
		int price_soda = 9;
		int price_candies = 6;
		int price_chewinggum = 4;
		int price_total = 0;
		int coins_total = 0;
		
		
		for (int i = 0; i < 5; ++i)
		{
			product_price[i] = 0;
			product_number[i] = 0;
		}
		
		
		System.out.print("_____________CANDY MACHINE_____________\n");
		System.out.print("| Chips[1]: $8                        |\n");
		System.out.print("| Chocolate[2]: $12                   |\n");
		System.out.print("| Soda[3]: $9                         |\n");
		System.out.print("| Candies[4]: $6                      |\n");
		System.out.print("| Chewing gum[5]: $4                  |\n");
		System.out.print("|_____________________________________|\n");
		System.out.print("Only accepts $1, $2, $5 and $10 coins\")\n\n");
		
		
		do
		{
			System.out.print("Insert the number of each coin\n");
			System.out.print("$1: ");
			coin[0] = stdIn.nextInt() * 1;
			System.out.print("$2: ");
			coin[1] = stdIn.nextInt() * 2;
			System.out.print("$5: ");
			coin[2] = stdIn.nextInt() * 5;
			System.out.print("$10: ");
			coin[3] = stdIn.nextInt() * 10;
		} while(coin[0] < 0 || coin[1] < 0 || coin[2] < 0 || coin[3] < 0);
		
		for (int i = 0; i < 4; ++i)
		{
			coins_total = coins_total + coin[i];
		}
		
		System.out.print("Your coins: " + coins_total + '\n');
		
		do
		{
			do
			{
				System.out.print("Enter the code of the product(s): ");
				input_code = stdIn.nextInt();
				System.out.print("Enter the quantity: ");
				input_quantity = stdIn.nextInt();
			}
			while((input_code < 0 || input_code > 5) && input_quantity <= 0); 
			
				switch(input_code)
				{
				case 1:
					if (coins_total >= input_quantity * price_chips)
					{
						product_number[0]+= input_quantity;
						coins_total -= input_quantity * price_chips;
					}
					else
					{
						System.out.print("Insufficient coins\n");
					}
					break;
				case 2:
					if (coins_total >= input_quantity * price_chocolate)
					{
						product_number[1] += input_quantity;
						coins_total -= input_quantity * price_chocolate;
					}
					else
					{
						System.out.print("Insufficient coins\n");
					}
					break;
				case 3:
					if (coins_total >= input_quantity * price_soda)
					{
						product_number[2] += input_quantity;
						coins_total -= input_quantity * price_soda;
					}
					else
					{
						System.out.print("Insufficient coins\n");
					}
					break;
				case 4:
					if (coins_total >= input_quantity * price_candies)
					{
						product_number[3] += input_quantity;
						coins_total -= input_quantity * price_candies;
					}
					else
					{
						System.out.print("Insufficient coins\n");
					}
					break;
				case 5:
					if (coins_total >= input_quantity * price_chewinggum)
					{
						product_number[4] += input_quantity;
						coins_total -= input_quantity * price_chewinggum;
					}
					else
					{
						System.out.print("Insufficient coins\n");
					}
					break;
				default:
					break;
				}
			System.out.print("Add another product (y/n)?: ");
			exit_menu = s.next().charAt(0);
		}
		while (exit_menu == 'y' && coins_total > 0); 
		
		System.out.print("\n\nDelivering product(s)...\n");
		for (int i = 0; i < 5; ++i)
		{
			if (product_number[i] != 0)
			{
				switch(i)
				{
				case 0: System.out.print("Chips: " + product_number[i] + '\n'); break;
				case 1: System.out.print("Chocolate: " + product_number[i] + '\n'); break;
				case 2: System.out.print("Soda: " + product_number[i] + '\n'); break;
				case 3: System.out.print("Candies: " + product_number[i] + '\n'); break;
				case 4: System.out.print("Chewing gum: " + product_number[i] + '\n'); break;
				}
			}
		}
		
		System.out.print("\n\nDelivering change...\n");
		System.out.print("Your change: " + (coins_total - price_total) + '\n');
		System.out.print("\nCome back soon!\n\n");
		
		
	}
}