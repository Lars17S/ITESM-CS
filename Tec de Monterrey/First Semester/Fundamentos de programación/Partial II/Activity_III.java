import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity_III {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		List<Double> vals = new ArrayList<Double>();
		List<String> operator = new ArrayList<String>();
		Double input_Val; // Creates input String
		String input_Operator;
		System.out.print("_____________________________CALCULATOR_____________________________\n");
		System.out.print("Insert number, then press ENTER | Insert operator, then press ENTER\n"
		+ "You can insert more than one value. To exit insert the operator \"=\"\n" + "Availables operators: +, -, *, /\n");
		do	{ // Cycle
			input_Val = stdIn.nextDouble();
			vals.add(input_Val); //Add input value to List
			stdIn.nextLine();
			
			input_Operator = stdIn.nextLine();
			if (!(input_Operator.isEmpty() || input_Operator.equals("="))) // Check if there is not operator or is empty
				operator.add(input_Operator);
			else break;	
		} while(true);

		input_Val = null; input_Operator = null; // Clears variables
		
		for (int i = 0 ; i < operator.size(); i++) {
		    String op = operator.get(i);
		    switch (op) {
		    case "+": vals.set(i, vals.get(i) + vals.get(i+1)); break;
		    case "-": vals.set(i, vals.get(i) - vals.get(i+1)); break;
		    case "*": vals.set(i, vals.get(i) * vals.get(i+1)); break;
		    case "/": vals.set(i, vals.get(i) / vals.get(i+1)); break;
		    }
		    operator.remove(i);
	        vals.remove(i+1);
	        --i;
		}
		System.out.print("Result: " + vals.get(0));
	}
}