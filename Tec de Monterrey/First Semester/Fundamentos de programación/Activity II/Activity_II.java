import java.util.Scanner;
public class Activity_II {
	public static void main(String arg[])
	{
		int read_tweet, send_tweet, promo_tweet, retweet_tweet, hashtag_tweet;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Hello\n");
		System.out.print("How many tweets have you read?\n");
		read_tweet = stdIn.nextInt();
		System.out.print("How many tweets have you send?\n");
		send_tweet = stdIn.nextInt();
		if (read_tweet == 0 && send_tweet == 0)
		{
			System.out.print("You category is: Egg");
			System.exit(0);
		}
		if (read_tweet > 0 && send_tweet == 0)
		{
			System.out.print("You category is: Marauder");
			System.exit(0);
		}
		
		System.out.print("How many of your sent tweets were for contests or promotions?\n");
		promo_tweet = stdIn.nextInt();
		if (promo_tweet == read_tweet)
		{
			System.out.print("Your category is: Contestant");
			System.exit(0);
		}
		System.out.print("How many of your sent tweets are retweets?\n");
		retweet_tweet = stdIn.nextInt();
		if (retweet_tweet >= (send_tweet)/2)
		{
			System.out.print("Your category is: Follower");
			System.exit(0);
		}
		System.out.print("How many of your sent tweets contain hashtags?\n");
		hashtag_tweet = stdIn.nextInt();
		if (hashtag_tweet >= (send_tweet/2))
		{
			System.out.print("Your category is: Explo2rer");
		}
		
	}
}