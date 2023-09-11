package Observer;

	/**
	 * 
	 * @author Nikitha Kondapeta
	 *
	 */
public class RoundScoreDisplay implements Observer{

	/**
	 * Subject is golfer and is a private variable
	 * Has two other private variables for strokes and par
	 */
	private Subject golfer;
	private int strokesTotal;
	private int parTotal;
	
	/**
	 * One of our observers are the hole score displays 
	 * @param golfer Subject golfer is passed through. 
	 */
	public RoundScoreDisplay(Subject golfer) {
		this.golfer=golfer;
		golfer.registerObserver(this);
	}
	/**
	 * This method updates the strokesTotal, and parTotal
	 * @param values strokesTotal and parTotal pass through
	 */
	public void update(int strokes, int par) {
		this.strokesTotal+=strokes;
		this.parTotal+=par;
	}
	
    public String toString()
    {
        return "RoundScoreDisplay: Total Strokes=" + strokesTotal + ", Total Par=" +parTotal;

    }

    private void display()
    {
        System.out.println(this);
    }
	
}