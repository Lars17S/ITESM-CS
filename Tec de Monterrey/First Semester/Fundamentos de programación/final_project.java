/* 
IMPORTANT: The first few times you should run the program in manual mode, until save 
enough words to a correctly automatic mode
*/

import twitter4j.*;
import twitter4j.auth.*;
import java.io.*;
import java.util.Scanner;

public class Experiment_Final {
	public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                //Variable to save current comment text (tweets founds)
                String comment, user_Name, movie_Name;
                char decision;
                
                //Twitter code
		Twitter twitter = TwitterFactory.getSingleton();
		twitter.setOAuthConsumer("l9kDrY82cEakKLnlN2EGZYTBX", "y8xkmUpG7qtxMnTz1GDvK3juvc390cxS828mxcr0VH6nf7Wknp");
		AccessToken accessToken = new AccessToken("1060890120163913733-9QHuOX9AwlOp6HaUJr9z8uaIkjeDqS","sg1wArOxpQskWclAyzNm43FkCS3i7iMuFk8AsMe1S5JZo");
		twitter.setOAuthAccessToken(accessToken);

                //Insert the name of the movie (NOTE: #MovieReview is optional, you can delete it)
                System.out.print("Write the name of the movie: ");
                movie_Name = scanner.nextLine();
		Query query = new Query(movie_Name + "#MovieReview");
                QueryResult result = twitter.search(query);
               
                //Once the text files are created, you can add the words manually or write them while runtime program.
		System.out.print("Do you want to use manual or automatic classification (A or M)? ");
                decision = scanner.next().charAt(0);
                
		for (Status status : result.getTweets()) {
                        comment = status.getText();
                        user_Name = status.getUser().getScreenName();
                        //OUTPUT: It prints the user name, comment, comment type and keyword(s) found
                        switch (decision) {
                            //MANUALLY CLASSIFICATION
                            case 'M': manualClassification(user_Name, comment);
                                break;
                            //AUTOMATIC CLASSIFICATION
                            case 'A': automaticClassification(user_Name, comment);
                                break;
                            //INVALID INPUT (nor A nor M)
                            default: System.out.print("ERROR");
                                break;
                        }
                        System.out.print("\n\n");
		}
	}
        
        public static void manualClassification (String user_Name, String comment) throws IOException {
            System.out.printf("@%s: %s\n", user_Name, comment);
            Create_TextFiles();
        }
        
        public static void automaticClassification (String user_Name, String comment) throws IOException, Exception {
            System.out.printf("@%s: %s\nCOMMENT TYPE: %s \n", user_Name, comment, classifyMessage(comment));
            System.out.print("Keyword(s): ");
            //If the comment does not have classification, then the program interpret it as "Unknown"
            if (!classifyMessage(comment).equals("Unknown"))
                //Prints the keywords that comment contains
                Words_Found(comment, classifyMessage(comment) + "Keywords.txt");
            else
                System.out.print("None");
        }
        
        //Function to write the given keywords into text file
        public static void writeKeyword(String keyword, String classification) throws IOException {
	    FileWriter fw = new FileWriter(new File(classification + "Keywords.txt"), true);
	    fw.write(keyword + System.getProperty( "line.separator"));
	    fw.close();
	}
	
        //Function to classify comments
        //Select the classification according to the largest number of keywords of any type found.
	public static String classifyMessage(String comment) throws Exception  {
		String file_name; 
		int[] Points = new int[3]; // {POSITIVE_POINTS, NEGATIVE_POINTS, NEUTRAL_POINTS}
		
		file_name = "PositiveKeywords.txt"; //OPTIONAL: Insert here text file address
		Points[0] = Point_Counter(comment, file_name);
		
		file_name = "NegativeKeywords.txt"; //OPTIONAL: Insert here text file address
		Points[1] = Point_Counter(comment, file_name);
		
		file_name = "NeutralKeywords.txt"; //OPTIONAL: Insert here text file address
		Points[2] = Point_Counter(comment, file_name);
		
                //If there are equal or more positive words than neutral words, but more positive than negative,
                //then it is a positive comment.
		if (Points[0] >= Points[2] && Points[0] > Points[1])
                        return "Positive";
                //If there are equal or more negative words than neutral words, but more negative than positive,
                //then it is a negative coment.
		else if (Points[1] >= Points[2] && Points[1] > Points[0])
                        return "Negative";
                //If there are more neutral words than positive and negative words, then it is neutral comment.
		else if (Points[2] > Points[0] && Points[2] > Points[1])
			return "Neutral";
                //Unknown case:
                //This is an ambiguous case, it could has equal number of positive, negative and neutral words,
                //or has more negative than neutral, but equal number of negatives and positives,
                //or does not have neither keyword
		else
			return "Unknown";
	}

        //Function to count how many positive, negative or neutral keywords there are in the comment.
	public static int Point_Counter(String comment, String file_name) throws Exception  { //Here I can write the name of the text file
		Scanner scanner = new Scanner(new File(file_name));
		int i = 0;
                String word;
		while(scanner.hasNext()) {
			word = scanner.nextLine();
			if(comment.contains(word)) 
				++i;
			}
		return i;
	}
	
        //Function to print the keywords found in the current comment
	public static void Words_Found(String comment, String file_name) throws Exception {
		Scanner scanner = new Scanner(new File(file_name));
		System.out.println();
                String word;
		while(scanner.hasNext()) {
			word = scanner.nextLine();
			if(comment.contains(word)) 
				System.out.printf("%s ", word);
			}
	}
        
	//Function to add the Keywords in the text files (Positive, Negative & Neutral)
	public static void Create_TextFiles() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[][] keyword = new String[3][]; // { POSITIVE_WORDS, NEGATIVE_WORDS, NEUTRAL_WORDS }
		int length;
		
                // Ask for the number of words to add
		System.out.print("Number of positive words to add: ");
		length = scanner.nextInt(); scanner.nextLine();
		keyword[0] = new String[length];
		System.out.print("Number of negative words to add: ");
		length = scanner.nextInt(); scanner.nextLine();
		keyword[1] = new String[length];
		System.out.print("Number of neutral words to add: ");
		length = scanner.nextInt(); scanner.nextLine();
		keyword[2] = new String[length];
		
                // Iteration for text files
		for (int i = 0; i < keyword.length; ++i) {
			switch(i) {
			case 0:
                                // Add the positive INPUT words into text file (PositiveKeywords.txt)
				System.out.print("Write the positive words\n");
				for(int j = 0; j < keyword[i].length; ++j) {
					System.out.print("Positive Word[" + j + "]: ");
					keyword[i][j] = scanner.nextLine();
                                        //Calls the function to write into text file
					writeKeyword(keyword[i][j], "Positive"); 
				}
				break;
			case 1: 
                                // Add the negative INPUT words into text file (NegativeKeywords.txt)
				System.out.print("Write the negative words\n");
				for(int j = 0; j < keyword[i].length; ++j) {
					System.out.print("Negative Word[" + j + "]: ");
					keyword[i][j] = scanner.nextLine();
                                        //Calls the function to write into text file
					writeKeyword(keyword[i][j], "Negative"); //Calls the function to write into text file
				}
				break;
			case 2:
				// Add the neutral INPUT words into text file (NeutralKeywords.txt)
                                System.out.print("Write the neutral words\n");
				for(int j = 0; j < keyword[i].length; ++j) {
					System.out.print("Neutral Word[" + j + "]: ");
					keyword[i][j] = scanner.nextLine();
                                        //Calls the function to write into text file
					writeKeyword(keyword[i][j], "Neutral");
				}
				break;
			default:
				break;
			}
			System.out.println();
		}
	}
}