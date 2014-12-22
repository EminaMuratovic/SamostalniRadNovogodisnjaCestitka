import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Geometry {
  
  private int radius;
  
  /**
	 * creates an arch
	 * @param positionX int first coordinate
	 * @param positionY int second coordinate
	 * @param color Color colore of the circle
	 * @param radius int radius of the circle
	  */
	public Circle(int positionX, int positionY, Color color, int radius ) {
		super(positionX, positionY, color);
		this.radius = radius;
		
		
	}
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.drawCircle(super.getPositionX(), super.getPositionY(), this.radius);
	}
	
	public void move(int frame) {
		return;
	}
	

}
