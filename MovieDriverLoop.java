import java.util.*;
public class MovieDriverLoop 
{
	public static void main(String[] args)
	{
	

		String input, repeat;
		int inputNumTickets;
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie1 = new Movie();
		
		do
		{
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
			
			
			System.out.println(movie1.toString());
			
			//catches new line character in buffer
			keyboard.nextLine();
			
			System.out.print("Do you want to enter another? (y or n)");
			repeat = keyboard.nextLine(); 
			
		} while(repeat.equalsIgnoreCase("y")); 
		
		keyboard.close();
		
		System.out.println("Goodbye");
		
		
	}
}
