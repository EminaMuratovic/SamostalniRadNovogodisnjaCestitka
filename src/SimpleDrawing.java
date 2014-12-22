import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleDrawing extends JPanel implements ActionListener {
	int frame = 0;
	Graphics g;

	public static void main(String[] args) {
		JFrame window = new JFrame("Happy Hollydays"); 
		SimpleDrawing drawArea = new SimpleDrawing();
		drawArea.setBackground(Color.GRAY.darker());
	     window.setContentPane(drawArea);
	     
	     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	     double screenWidth = screenSize.getWidth();
	     double screenHeight = screenSize.getHeight();
	     int windowHeight = 800;
	     int windowWidth = 600;
	     
	     int positionHeight = (int) (screenHeight - windowHeight) / 2; 
	     int positionWidth = (int) (screenWidth - windowWidth) / 2; 
	     
	     window.setSize(windowHeight, windowWidth);
	     window.setLocation(positionWidth, positionHeight);
	     
	     window.setResizable(false);
	     
	     Timer frameTimer = new Timer(60,drawArea);
	     window.setVisible(true);
	     frameTimer.start();
	     
	  
   }
	   
	     


	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	 protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        drawFrame(g, frame++);
	    }
	 
	  public void drawFrame(Graphics g, int frameNumber) {
		 
	     g.setColor(Color.RED.brighter());
	       g.fillOval(50, 50, 50, 50);
	       Arch arch = new Arch(100, 100, Color.RED, 50, 50, 45, 60);
	       arch.draw(g, frame);
	       Circle circle = new Circle(400, 400, Color.WHITE, 60);
	       circle.draw(g, frameNumber);
	       circle.fill(g, frameNumber);
	       Rectangle rectangle = new Rectangle(100, 200, Color.BLUE, 200, 200);
	       rectangle.draw(g, frameNumber);
	       rectangle.fill(g, frameNumber);
	       Line line = new Line(200, 200, Color.YELLOW, 300, 300);
	       line.draw(g, frameNumber);
	       g.drawString("MI SMO NAJBOLJI!", 180, 180);
	    }
	  
	 

}
