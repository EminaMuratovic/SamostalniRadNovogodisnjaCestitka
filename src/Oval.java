import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Geometry {
	private int radius1;
	private int radius2;
	
	public Oval (int positionX, int positionY, Color color, int radius1, int radius2) {
		super(positionX, positionY, color);
		this.radius1 = radius1;
		this.radius2 = radius2;
	}
	
	/**
	 * draws the oval
	 */
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.drawOval(super.getPositionX(),  super.getPositionY(), this.radius1, this.radius2);
		g.fillOval(super.getPositionX(),  super.getPositionY(), this.radius1, this.radius2);
		
	}
	
	public void move(int frame) {
		return;
	}

}
