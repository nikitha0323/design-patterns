import java.util.Random;
public class BlockBehavior implements DefenceBehavior {
	
	/**
	 * Block behavior is randomly selected for the football player
	 */
	private Random rand;
	private String[] blocks = { "kick", "punt", "pass", "catch"};

	public BlockBehavior()
	{
		rand = new Random();
	}

	public String play()
	{
		return "block a "+ blocks[rand.nextInt(blocks.length)];
	}
		
	}
