import java.awt.Color;
import java.awt.Graphics;

public class Snowman extends Geometry {

	Geometry[] parts;

	public Snowman(int positionX, int positionY, Color color) {
		super(positionX, positionY, color);
		int height = 150;
		parts = new Geometry[10];

		final int MID = super.getPositionX() / 2; // middle of the snowman
		final int TOP = positionY - height / 2; // top of the snowman

		int bottomRadius = (int) (height * 0.5);
		int middleRadius = (int) (bottomRadius * 0.7);
		int headRadius = (int) (bottomRadius * 0.4);

		int i = 0;
		parts[i] = new Line(MID, TOP + 50, Color.BLACK, MID - 50, TOP + 30);
		
		// draw right arm
		
		i++;
		parts[i] = new Line(MID, TOP + 50,  Color.BLACK, MID + 55, TOP + 30);
		i++;
		parts[i] = new Oval(MID - headRadius / 2, TOP, Color.BLACK, headRadius, headRadius);
		
		// draw base (lower torso)
		
				i++;
				parts[i] = new Oval(MID - bottomRadius / 2,(int) (TOP + bottomRadius * 0.8), Color.BLACK, bottomRadius,(int) (bottomRadius * 0.8));

		// left eye
				
				i++;
				parts[i] = new Circle(MID - 10, TOP + 10, Color.WHITE, 5);
		
		// draw middle (upper torso)
		
		i++;
		parts[i] = new Oval(MID - middleRadius / 2, TOP + middleRadius / 2, Color.BLACK,
				middleRadius, (int) (middleRadius * 0.8));
		
		
		
		// draw right eye
		
		i++;
		parts[i] = new Circle(MID + 5, TOP + 10, Color.WHITE, 5);


		i++;
		parts[i] = new Arch (MID - 10, TOP + 10, Color.RED, 20, 10, 190, 160);

		i++;
		parts[i] = new Line(MID - 20, TOP + 5, Color.MAGENTA, MID + 20, TOP + 5);
		
		// draw hat
		/*
		 * // draw brim of hat ; // draw top of hat */
		i++;
		parts[i] = new Rectangle (MID - 15, TOP - 20, Color.MAGENTA, 30, 25);


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
