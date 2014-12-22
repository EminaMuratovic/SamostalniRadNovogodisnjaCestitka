import java.awt.Color;

import java.awt.Graphics;

public class Line extends Geometry {

	private int positionX2;
	private int positionY2;

	/**
	 * creates a line
	 * @param positionX int first coordinate
	 * @param positionY int second coordinate
	 * @param color Color color of the line
	 * @param length int length of the line
	 */

	public Line(int positionX, int positionY, Color color, int positionX2, int positionY2) {

		super(positionX, positionY, color);

		this.positionY2 = positionY2;
		this.positionX2 = positionX2;

	}

	/**
	 * draws the line
	 */
	public void draw(Graphics g, int frame) {

		g.setColor(super.getColor());

		g.drawLine(super.getPositionX(), super.getPositionY(), this.positionX2, this.positionY2);
		

	}

	/**
	 * moves the lines up and down
	 */
	public void move(int frame) {
		positionX2 = (int) (positionX2 + Math.sin(frame / 5) * 6);
		positionY2 = (int) (positionY2 + Math.sin(frame / 5) * 6);
	}

}