import java.awt.Color;
import java.awt.Graphics;


public class Arch extends Geometry {
	private int width;
	private int height;
	private int startAngle;
	private int archAngle;
	
	/**
	 * creates an arch
	 * @param positionX int first coordinate
	 * @param positionY int second coordinate
	 * @param color Color colore of the arch
	 * @param width int width of the arch
	 * @param height int height of the arch
	 * @param startAngle int starting point of the angle
	 * @param archAngle int arch angle
	 */
	public Arch(int positionX, int positionY, Color color, int width, int height, int startAngle, int archAngle) {
		super(positionX, positionY, color);
		this.width = width;
		this.height = height;
		this.startAngle = startAngle;
		this.archAngle = archAngle;
	}
	
	/**
	 * draws the arch
	 */
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.drawArc(super.getPositionX(), super.getPositionY(), this.width, this.height, this.startAngle, archAngle);
	}
	
	public void move(int frame) {
		return;
	}

}
