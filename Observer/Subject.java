package Observer;

/**
 * 
 * @author Nikitha Kondapeta
 *
 */
public interface Subject {
	/**
	 * The Subject of observation has a register add for the Observer	 */
	public void registerObserver(Observer observer);
	/**
	 * The Subject of observation has a register remove for the Observer	 */
	public void removeObserver(Observer observer);
	/**
	 * This method notifies the observes and passes the strokes and pars
	 */
	public void notifyObservers(int strokes, int par);

}