import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActivityIIb {
	public static void main(String args[])	{
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		List<String> word = new ArrayList<String>(); // Creates a dynamic array of Strings
		String input_Word = null; // Creates input String
		
		while(true)	{ // Cycle
			input_Word = stdIn.nextLine();
			if (!input_Word.isEmpty()) // Check if String is empty
				word.add(input_Word); //Add string to List.word(i)
			else
				break;
		}
		input_Word = null; // Clears variable
		
		List<String> largest_word = new ArrayList<String>(); //List of largest word (if there are words with equal length)
		largest_word.add(""); //Add first empty word
		boolean repeated_Word = false; // Bool variable for repeated words 
		
		for (int i = 0; i < word.size(); ++i)	{
			if(word.get(i).length() > largest_word.get(0).length()) { //Check if current work is longer
				largest_word.clear(); //
				largest_word.add(word.get(i).toString());
			}
			else if(word.get(i).length() == largest_word.get(0).length())	{
				for(String eachItemInList : largest_word) // Check if word(i) is not a repeated word in largest_word list
					if (word.get(i).equals(eachItemInList))
						repeated_Word = true;
				if(repeated_Word == false)
					largest_word.add(word.get(i).toString());
			}
		}
	
		System.out.print("\n\n");
		for(String eachItemInList : largest_word)
			System.out.print(eachItemInList + " ");
		
	}
}	