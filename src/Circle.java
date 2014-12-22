import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Geometry {
	private int radius;
	 
	 /**
	 * creates a circle
	 * @param positionX int first coordinate
	 * @param positionY int second coordinate
	 * @param color Color colore of the circle
	 * @param radius int radius of the circle
	  */
	public Circle(int positionX, int positionY, Color color, int radius ) {
		super(positionX, positionY, color);
		this.radius = radius;
		
	}
	
	/**
	 * draws the circle
	 */
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.drawOval(super.getPositionX(),  super.getPositionY(), this.radius, this.radius);
		g.fillOval(super.getPositionX(),  super.getPositionY(), this.radius, this.radius);
		
	}
	
	public void move(int frame) {
		return;
	}
	

}
