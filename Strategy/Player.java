/**
 * 
 * @author nikitha kondapeta
 * Player class for football players
 */
public abstract class Player {

	protected String name;
	private boolean defence=true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	/**
	 * Creates a player with an indiciated name and sets the Defence and offence Behavior
	 * 
	 */
	public Player(String name)
	{
		this.name=name;
		setDefenceBehavior();
		setOffenceBehavior();
	
	}
	public abstract void setDefenceBehavior();
	
	public abstract void setOffenceBehavior();
	/**
	 * 
	 * String play is representated below
	 */
	
	public String play() 
	{
		if(this.defence) 
		{
			return this.offenceBehavior.play();
			
        }
		else 
		{
			if (this.defenceBehavior==null)
				return "not playing";
			else
				return this.defenceBehavior.play();
        }
}
	public void turnover()
	{
		this.defence=!this.defence;
	}
}