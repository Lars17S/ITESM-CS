import java.util.Scanner;
import java.util.Objects;

public class HomeworkI_2 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String sex;
		int age = 0;
		int n_answer = 0;
		char r_answer;
		
		
		System.out.print("What is your sex (man / woman)?");
		sex = stdIn.nextLine();
		System.out.print("How old are you?");
		age = stdIn.nextInt();
		if(Objects.equals(sex, "woman")) {
		if (age < 18)
		{
			System.out.print("I think that you need this...");
			System.exit(0);
		}
		else if (age > 23)
		{
			System.out.print("I am sorry");
			System.exit(0);
		}
		
		System.out.print("OK, You will answer a test, are you ready to find your love (y / n)?");
		r_answer = s.next().charAt(0);
		if (r_answer == 'y')
		{
			System.out.print("Respond with 'y' (yes) or 'n' (no)\n");
			System.out.print("Do you like to explore, draw or learn? "); //1
			r_answer = s.next().charAt(0);
			if (r_answer == 'y')
			{
				n_answer++;
			}
			System.out.print("Is it easy for you to get close to other people? "); //2
			r_answer = s.next().charAt(0);
			if (r_answer == 'n');
			{
				n_answer++;
			}
			System.out.print("Do you usually start conversations? "); //3
			r_answer = s.next().charAt(0);
			if (r_answer == 'y');
			{
				n_answer++;
			}
			System.out.print("Do you feel highly motivated and energetic? "); //4
			r_answer = s.next().charAt(0);
			if (r_answer == 'y')
			{
				n_answer++;
			}
			System.out.print("Do you enjoy being the center of attention? "); //5
			r_answer = s.next().charAt(0);
			if (r_answer == 'n')
			{
				n_answer++;
			}
			System.out.print("Is it annoying to you to be close to other people? "); //6
			r_answer = s.next().charAt(0);
			if (r_answer == 'n')
			{
				n_answer++;
			}
			System.out.print("Do you like to travel? "); //7
			r_answer = s.next().charAt(0);
			if (r_answer == 'y') 
			{
				n_answer++;
			}
			System.out.print("Are you attracted to science and technology? "); //8
			r_answer = s.next().charAt(0);
			if (r_answer == 'y')
			{
				n_answer++;
			}
			System.out.print("Do you like music? "); //9
			r_answer = s.next().charAt(0);
			if (r_answer == 'y')
			{
				n_answer++;
			}
			System.out.print("Do you usually help other people in what they need?\n"); //10
			r_answer = s.next().charAt(0);
			if (r_answer == 'y')
			{
				n_answer++;
			}
			
			if (n_answer >= 9)
			{
				System.out.print("We are compatible");
			}
			else 
			{
				System.out.print("I am sorry but I can not stay with you...\n");
			}
		}
		}
	}
}