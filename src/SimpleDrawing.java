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

import java.awt.Graphics.*;

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
	     
	     Timer frameTimer = new Timer(120,drawArea);
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
		 
		   Snowman s = new Snowman(200, 200, Color.WHITE);
	       s.draw(g, frameNumber);
	       Snow snow = new Snow(Color.WHITE, 800);
	       Snow snow2 = new Snow(Color.RED, 800);
	       Snow snow3 = new Snow(Color.YELLOW, 800);
	       snow2.draw(g, frameNumber);
	       snow.draw(g, frameNumber);
	       snow3.draw(g, frameNumber);
	       
	       Font a = new Font("SANS", 5, 20);
	       g.setFont(a);
	       g.drawString("MI SMO NAJBOLJI!", 180, 180);

	       
	    }
	  
	 

}
