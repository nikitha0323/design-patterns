import java.util.Random;
public class BlockBehavior implements DefenceBehavior {
	
	/**
	 * Block behavior is randomly selected for the football player
	 */
	public String play() 
	{
		Random rand=new Random();
		int choice=rand.nextInt(3);
		if(choice== 0)
		
			return " kick";
		
		else if(choice == 1)
		
			return " punt";
		
		else if (choice == 2)
		
			return " catch";
		return null;
		
	}
}