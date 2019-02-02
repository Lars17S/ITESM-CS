public class ActivityI_1
{
	public static void main(String[] args) 
	{
		/* [0] = a, [1] = b, [2] = c, [3] = d, [4] = e, [5] = f, [6] = g */
		boolean letter[] = new boolean[7];
		for (int i = 0; i < 7; ++i)
		{
			letter[i] = false;
		}
		
		
		System.out.print("Is a open? ");
		letter[0] = Boolean.parseBoolean(System.console().readLine());
		if (letter[0] == true)
		{
			System.out.print("Is d open? ");
			letter[3] = Boolean.parseBoolean(System.console().readLine());
			if (letter[3] == true)
			{
				System.out.print("Is g open? ");
				letter[6]= Boolean.parseBoolean(System.console().readLine());
			}
		}
		System.out.print("Is b open? " );
		letter[1]= Boolean.parseBoolean(System.console().readLine());
		if (letter[1] == true)
		{
			System.out.print("Is c open? " );
			letter[2]= Boolean.parseBoolean(System.console().readLine());
			if (letter[2] == true)
			{
				System.out.print("Is e open? " );
				letter[4]= Boolean.parseBoolean(System.console().readLine());
			}
			else
			{
				System.out.print("Is f open? " );
				letter[5]= Boolean.parseBoolean(System.console().readLine());
			}
		}
		
		if (letter[0] == true)
		{
			if (letter[3] == true)
			{
				if (letter[6] == true)
				{
					System.out.print("OUTPUT: v\n");
				}
				else
				{
					System.out.print("OUTPUT: w\n");
				}
			}
			else
			{
				System.out.print("OUTPUT: x \n");
			}
		}
		if (letter[1] == true)
		{
			if (letter[2] == true)
			{
				if (letter[4] == true)
				{
					System.out.print("OUTPUT: x \n");
				}
				else
				{
					System.out.print("OUTPUT: y \n");
				}
			}
			else
			{
				if (letter[5] == true)
				{
					System.out.print("OUTPUT: y");
				}
				else
				{
					System.out.print("OUTPUT: z");
				}
			}
		}
	}
}