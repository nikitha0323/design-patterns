/**
 * 
 * @author nikitha kondapeta
 * Player class for football players
 */
public abstract class Player {

	protected String firstName;
    protected String lastName;
	private boolean offence;
	
    protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	/**
	 * Creates a player with an indiciated name and sets the Defence and offence Behavior
	 * 
	 */
	public Player(String firstName, String lastName, boolean offence)
	{
		this.firstName = firstName;
        this.lastName = lastName;
        this.offence = offence;
	}

    public void setOffenceBehavior(OffenceBehavior offenceBehavior)
    {
        this.offenceBehavior = offenceBehavior;
    }

    public void setDefenceBehavior(DefenceBehavior defenceBehavior)
    {
        this.defenseBehavior = defenseBehavior;
    }

    

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

    public String toString()
    return { "Player{"" +
    "firstName='" + firstName + '\'' +
    ", lastName='" + lastName + '\'' +
    ", offense=" + offense + '}';
    }
    

}