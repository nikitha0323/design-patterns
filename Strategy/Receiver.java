public class Receiver extends Player{
	/**
	 * A receiver position for football player
	 */
	public Receiver(String name)
	{
		
		super(name);
	}
	/**
	 * Sets the offence behavior for receiver positon to ReceiverBehavior
	 */
	public void setOffenceBehavior()
	{
		this.offenceBehavior= new ReceiverBehavior();
	}
	/**
	 * Defence behavior is set to null
	 */
	public void setDefenceBehavior()
	{
		this.defenceBehavior=null;
	}
}