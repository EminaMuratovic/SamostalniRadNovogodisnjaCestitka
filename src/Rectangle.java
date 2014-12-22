import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Geometry {
	private int width;
	private int height;
	
	/**
	 * creates an rectangle object
	 * @param positionX int first coordinate
	 * @param positionY int second coordinate
	 * @param color Color colore of the rectangle
	 * @param width int width of the rectangle
	 * @param height int height of the rectangle
	 */
	public Rectangle(int positionX, int positionY, Color color, int width, int height) {
		super(positionX, positionY, color);
		this.width = width;
		this.height = height;
		}
	
	/**
	 * draws the rectangle
	 */
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.drawRect(super.getPositionX(), super.getPositionY(), this.width, this.height);
	}
	
	public void fill(Graphics g, int frame) {
		g.fillRect(super.getPositionX(), super.getPositionY(), this.width, this.height);
	}
	
	public void move(int frame) {
		return;
	}
}