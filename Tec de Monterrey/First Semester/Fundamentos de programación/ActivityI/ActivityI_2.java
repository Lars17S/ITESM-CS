import java.util.Scanner;
public class ActivityI_2 
{
	public static double track_calculate(double P, double A, double B, double C)
	{
		return A * Math.pow(B - P, C);
	}
	public static double field_calculate(double P, double A, double B, double C)
	{
		return A * Math.pow(P - B, C);
	}
	public static void main(String[] arg)
	{
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		double[] P = new double[10];
		double total_points = 0;
		double A, B, C;
		System.out.print("Enter the values with the correct units\n");
		System.out.print("______________POINTS MENU_______________\n");
		
		System.out.print("100 meters race (seconds): ");
		P[0] = stdIn.nextDouble();
		System.out.print("Discus throw (meters): ");
		P[1] = stdIn.nextDouble();
		System.out.print("Pole vault (centimeters): ");
		P[2] = stdIn.nextDouble();
		System.out.print("Javelin throw (meters): ");
		P[3] = stdIn.nextDouble();
		System.out.print("400 meters (seconds): ");
		P[4] = stdIn.nextDouble();
		System.out.print("110 meters hurdles (seconds): ");
		P[5] = stdIn.nextDouble();
		System.out.print("Long jump (centimeters): ");
		P[6] = stdIn.nextDouble();
		System.out.print("Shot put (meters): ");
		P[7] = stdIn.nextDouble();
		System.out.print("High jump (centimeters): ");
		P[8] = stdIn.nextDouble();
		System.out.print("1500 meters (seconds): ");
		P[9] = stdIn.nextDouble();
		System.out.print("___________________________________\n\n");
		
		// 100 meters race (track)
		A = 25.4347;
		B = 18;
		C = 1.81;
		System.out.print("100 meters race: " + track_calculate(P[0], A, B, C));
		P[0] = track_calculate(P[0], A, B, C);
		
		// Discuss throw
		A = 12.91;
		B = 4;
		C = 1.1;
		System.out.print("\nDiscuss throw: " + field_calculate(P[1], A, B, C) + '\n');
		P[1] = field_calculate(P[1], A, B, C);
		
		// Pole vault
		A = 0.2797;
		B = 100;
		C = 1.35;
		System.out.print("Pole vault: " + field_calculate(P[2], A, B, C) + '\n');
		P[2] = field_calculate(P[2], A, B, C);
		
		// Javelin throw
		A = 10.14;
		B = 7;
		C = 1.08;
		System.out.print("Javelin throw: " + field_calculate(P[3], A, B, C) + '\n');
		P[3] = field_calculate(P[3], A, B, C);
		
		// 400 meters
		A = 1.53775;
		B = 82;
		C = 1.81;
		System.out.print("400 meters: " + track_calculate(P[4], A, B, C) + '\n');
		P[4] = track_calculate(P[4], A, B, C);
		
		// 110 meters hurdles (track)
		A = 5.74352;
		B = 28.5;
		C = 1.92;
		System.out.print("110 meters hurdles: " + track_calculate(P[5], A, B, C) + '\n');
		P[5] = track_calculate(P[5], A, B, C);
		
		// Long jump (track)
		A = 0.14354;
		B = 220;
		C = 1.40;
		System.out.print("Long jump: " + field_calculate(P[6], A, B, C) + '\n');
		P[6] = field_calculate(P[6], A, B, C);
		
		// Shot put
		A = 51.39;
		B = 1.5;
		C = 1.05;
		System.out.print("Shot put: " + field_calculate(P[7], A, B, C) + '\n');
		P[7] = field_calculate(P[7], A, B, C);
		
		// High jump
		A = 0.8465;
		B = 75;
		C = 1.42;
		System.out.print("High jump: " + field_calculate(P[8], A, B, C) + '\n');
		P[8] = field_calculate(P[8], A, B, C);
		
		// 1500 meters (track)
		A = 0.03768;
		B = 480;
		C = 1.85;
		System.out.print("1500 meters: " + track_calculate(P[9], A, B, C) + '\n');
		P[9] = track_calculate(P[9], A, B, C);
		
		for (int i = 0; i < 10; ++i)
		{
			total_points = total_points + P[i];
			System.out.print("\nTotal points: " + total_points + '\n');
		}
		
	}
}