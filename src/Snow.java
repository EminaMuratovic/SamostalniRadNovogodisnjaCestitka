import java.awt.Graphics;
import java.awt.Color;

public class Snow extends Geometry{
	private Circle[] flakes;
	private int windowWidth;
	private int count = 0;
	
	public Snow(Color color, int windowWidth) {
		super(0, 0, color);
		this.flakes = new Circle[300];
		this.windowWidth = windowWidth;
		count = 0;
		generateFlakes(flakes.length);
	}
	
	private void generateFlakes(int size) {
		for(int i = 0; i < size; i++)
			addFlake(generateFlake());
	}
	
	private Circle generateFlake() {
		int x = (int)(Math.random() * windowWidth);
		int y = 0;
		int radius = (int) (Math.random() * 5);
		return new Circle(x, y,  super.getColor(), radius);
	}
	
	private void addFlake(Circle flake) {
		if(count == flakes.length)
			resize();
		flakes[count] = flake;
		count++;
	}
	
	private void resize() {
		Circle[] tmp = new Circle[flakes.length * 2];
		for(int i = 0; i < flakes.length; i++)
			tmp[i] = flakes[i];
		flakes = tmp;
	}
	
	public void move(int frame) {
		for(int i = 0; i < flakes.length; i++) {
			int moveY = (int) (Math.random() * frame);
			flakes[i].setPositionY(moveY);
		}
			
	}
	
	public void draw(Graphics g, int frame) {
	move(frame);
	for(int i =0; i < flakes.length; i++)
		flakes[i].draw(g, 0);
	}
}
