import java.util.Random;

public class RunBehavior implements OffenceBehavior {

	/**
	 * Offence behavior is randomly selected for the football player and selects a statement
	 */
	public String play() 
	{
		Random rand=new Random();
		int choice=rand.nextInt(4);
		if(choice== 0)
		
			return " runs a drive up the gut";
		
		else if(choice == 1)
		
			return " draw";
		
		else if (choice == 2)
		
			return " pitch";
		else if (choice==3)
			return " reverse";
		return null;

		
	}
}