import java.util.Random;
 /**
 * 
 * @author nikitha kondapeta 
 * Another football player position, Lineman extends from the player class
 */
public class Lineman extends Player{

	public Lineman(String firstName, String lastName, boolean offence)
	{
		super(firstName,lastName, offence);
		setOffenceBehavior();
		setDefenceBehavior();
	}
	/**
	 * Sets offence behavior for the lineman
	 */
	public void setOffenceBehavior()
	{
		
		 this.offenceBehavior= new OBlockBehavior();
		
	}
	/**
	 * randomly sets defence behavior for the lineman
	 */
	public void setDefenceBehavior()
	{
			Random rand=new Random();
			int choice=rand.nextInt(3);
			if(choice== 0)
			
			 this.defenceBehavior= new SackBehavior();
			
			else if(choice == 1)
			
				this.defenceBehavior= new StripBehavior();
			
			else if (choice == 2)
			
				this.defenceBehavior= new BlockBehavior();
		
	}
}