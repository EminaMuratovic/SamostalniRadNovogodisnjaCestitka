import java.awt.Graphics;
import java.awt.Color;

public class Snow extends Geometry{
	private Circle[] flakes;
	private int windowWidth;
	private int count = 0;
	
	/**
	 * creates snow
	 * @param color Color color of the snow
	 * @param windowWidth int width of the window
	 */
	public Snow(Color color, int windowWidth) {
		super(0, 0, color);
		this.flakes = new Circle[300];
		this.windowWidth = windowWidth;
		count = 0;
		generateFlakes(flakes.length);
	}
	
	/**
	 * makes the snow, generates flakes and adds them in the snow
	 * @param size int how many flakes
	 */
	private void generateFlakes(int size) {
		for(int i = 0; i < size; i++)
			addFlake(generateFlake());
	}
	
	/**
	 * makes one by one flake
	 * @return flake
	 */
	private Circle generateFlake() {
		int x = (int)(Math.random() * windowWidth);
		int y = 0;
		int radius = (int) (Math.random() * 5);
		return new Circle(x, y,  super.getColor(), radius);
	}
	
	/**
	 * adds a flake to the snow
	 * @param flake Circle flake
	 */
	private void addFlake(Circle flake) {
		if(count == flakes.length)
			resize();
		flakes[count] = flake;
		count++;
	}
	
	/**
	 * resizes the array of the flakes
	 */
	private void resize() {
		Circle[] tmp = new Circle[flakes.length * 2];
		for(int i = 0; i < flakes.length; i++)
			tmp[i] = flakes[i];
		flakes = tmp;
	}
	
	/**
	 * moves the flakes from top to bottom of the window 
	 */
	public void move(int frame) {
		int fallen = 0;
		for(int i = 0; i < count; i++) {
			if(flakes[i].getPositionY() < windowWidth - 300) {
				int moveY = (int) (Math.random() * frame);
				flakes[i].setPositionY(moveY);
			}
			else{
				fallen++;
			}
		}
		if(fallen >= flakes.length / 2) {
			int flakesToAdd = 200;
			for(int i = 0; i < flakesToAdd; i++)
				addFlake(generateFlake());
		}
			
	}
	
	/**
	 * draws the flakes
	 */
	public void draw(Graphics g, int frame) {
	move(frame);
	System.out.println(count);
	for(int i =0; i < count; i++)
		flakes[i].draw(g, 0);
	}
}
