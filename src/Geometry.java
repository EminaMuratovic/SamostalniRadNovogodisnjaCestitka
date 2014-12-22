import java.awt.Color;
import java.awt.Graphics;

public class Geometry implements GeometryObject {
	private int positionX;
	private int positionY;
	private Color color;
	
	/**
	 * creates geometry object
	 * @param positionX int first coordinate of the begining of the object
	 * @param positionY int second coordinate of the begining of the object
	 * @param color Color color of the object
	 */
	public Geometry(int positionX, int positionY, Color color) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.color = color;
	}
	

	@Override
	public void draw(Graphics g, int frame) {
		return; // we just need this so the polymorphism works
	}

	@Override
	public void move(int frame) {
		positionX += frame;
		positionY += frame;
	}

	/**
	 * gets the first coordinate of the begining of the object
	 * @return first coordinate
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * sets the first coordinate of the begining of the object
	 * @param positionX int first coordinate of the begining of the object
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * gets the second coordinate of the begining of the object
	 * @return second coordinate
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * sets the second coordinate of the begining of the object
	 * @param positionY int second coordinate of the begining of the object
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	/**
	 * gets the color of the object
	 * @return color of the object
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * sets the color of the object
	 * @param color color of the object
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	


}
