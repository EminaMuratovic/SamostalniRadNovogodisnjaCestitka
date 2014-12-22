import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class Snowman extends Geometry {

	Geometry[] parts;

	public Snowman(int positionX, int positionY, Color color) {
		super(positionX, positionY, color);
		int height = 150;
		parts = new Geometry[10];

		final int MID = super.getPositionX() / 2; // middle of the snowman
		final int TOP = positionY - height / 2; // top of the snowman

		int bottomRadius = (int) (height * 1.8);
		int middleRadius = (int) (bottomRadius * 0.7);
		int headRadius = (int) (bottomRadius * 0.4);

		int i = 0;
		//left arm
		
		parts[i] = new Rectangle(MID-130, TOP + 150, Color.BLACK, 50, 5);
		
		// draw right arm
		
		i++;
		
		parts[i] = new Rectangle(MID+80, TOP + 150, Color.BLACK, 50, 5);
		
		
		i++;
		parts[i] = new Oval(MID - headRadius / 2, TOP, Color.BLACK, headRadius, headRadius);
		
		// draw base (lower torso)
		
				i++;
				parts[i] = new Oval(MID - bottomRadius / 2,(int) (TOP + bottomRadius * 0.8), Color.BLACK, bottomRadius,(int) (bottomRadius * 0.8));

		// left eye
				
				i++;
				parts[i] = new Circle(MID - 23, TOP + 25, Color.WHITE, 10);
		
		// draw middle (upper torso)
		
		i++;
		parts[i] = new Oval(MID - middleRadius / 2, TOP + middleRadius / 2, Color.BLACK,
				middleRadius, (int) (middleRadius * 0.8));
		
		
		
		// draw right eye
		
		i++;
		parts[i] = new Circle(MID + 20, TOP + 25, Color.WHITE, 10);


		i++;
		parts[i] = new Arch (MID - 15, TOP + 60, Color.RED, 40, 10, 145, 160);

		i++;
		parts[i] = new Line(MID - 20, TOP + 5, Color.RED, MID + 20, TOP + 5);
		
		// draw hat
		/*
		 * // draw brim of hat ; // draw top of hat */
		i++;
		parts[i] = new Rectangle (MID - 15, TOP - 20, Color.RED, 30, 25);


	}

	public void draw(Graphics g, int frame) {
		for (int i = 0; i < parts.length; i++) {
			if( i < 2)
			parts[i].draw(g, frame);
			else
				parts[i].draw(g, 0);
		}

	}

}
