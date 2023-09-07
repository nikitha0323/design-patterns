import java.util.Random;
public class BlockBehavior implements DefenceBehavior {
	
	/**
	 * Block behavior is randomly selected for the football player
	 */
	Random rand = Random();
	private String[] blocks = { "kick", "punt", "pass", "catch"};

	public String play()
	{
		return "block a "+ blocks(rand.nextInt(blocks.length));
	}

	private String blocks(int nextInt) {
		return null;
	}

	private Random Random() {
		return null;
	}
		
	}
