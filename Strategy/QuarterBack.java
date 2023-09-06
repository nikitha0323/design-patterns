import java.util.Random;

public class QuarterBack extends Player {
/**
 * 
 * One of the player positions extending from the parent class
 */
	public QuarterBack(String name)
	{
		super(name);
		
	}
	/**
	 * Randomly chooses an offensive behavior out of two options
	 */
	public void setOffenceBehavior()
	{
		Random rand=new Random();
		int choice=rand.nextInt(2);
		if(choice== 0)
		
		 this.offenceBehavior= new RunBehavior();
		
		else if(choice == 1)
		
			this.offenceBehavior= new PassBehavior();
		
	}
	public void setDefenceBehavior()
	{
		this.defenceBehavior= null;
	}
}