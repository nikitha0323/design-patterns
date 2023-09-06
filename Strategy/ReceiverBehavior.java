import java.util.Random;

public class ReceiverBehavior implements OffenceBehavior{
	/**
	 * Offence statement behavior is randomly selected for the football player
	 */
	public String play() 
	{
		Random rand=new Random();
		int choice=rand.nextInt(5);
		if(choice== 0)
		
			return " runs a slant route ";
		
		else if(choice == 1)
		
			return " runs a out route";
		
		else if (choice == 2)
		
			return " runs a seem route";
		else if (choice==3)
			return " runs a screen pass";
		else if (choice==4)
			return " runs a hail mary";
		return null;

		
	}
}