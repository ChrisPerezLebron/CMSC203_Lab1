import java.util.Scanner;
public class MovieDriver
{
	public static void main(String[] args)
	{
	

		String input;
		int inputNumTickets;
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie1 = new Movie();
		
		System.out.print("Enter the title of a movie: ");
		input = keyboard.nextLine();
		movie1.setTitle(input);
		
		System.out.print("Enter the movie's ratings: ");
		input = keyboard.nextLine();
		movie1.setRating(input);
		
		System.out.print("Enter the number of tickets sold at a" + 
						" unnamed) theater: ");
		inputNumTickets = keyboard.nextInt();
		movie1.setSoldTickets(inputNumTickets);
		
		keyboard.close();
		
		System.out.println(movie1.toString());
		
		System.out.println("Goodbye");
		
		
	}
}
