import java.util.Random;

public class PassBehavior implements OffenceBehavior{

	/**
	 * An offence behavior, the pass behavior.
	 * What the players offence behavior is based off of the random selection
	 */
	public String play() 
	{
		Random rand=new Random();
		int choice=rand.nextInt(5);
		if(choice== 0)
		
			return " throws a slant route ";
		
		else if(choice == 1)
		
			return " throws a out route";
		
		else if (choice == 2)
		
			return " throws a seem route";
		else if (choice==3)
			return " throws a screen pass";
		else if (choice==4)
			return " throws a hail mary";
		return null;

		
	}
}