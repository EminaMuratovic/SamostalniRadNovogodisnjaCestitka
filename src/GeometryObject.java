import java.awt.Graphics;

public interface GeometryObject {
	/**
	 * drawes the object
	 * @param g Graphics
	 * @param frame int
	 */
	public void draw(Graphics g, int frame);
	
	/**
	 * moves the object
	 * @param frame int
	 */
	public void move(int frame);
	
}
