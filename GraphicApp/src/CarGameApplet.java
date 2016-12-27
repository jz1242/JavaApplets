import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JApplet;


public class CarGameApplet extends Applet
{

		
		public CarGameApplet() throws HeadlessException 
		{
			xloc=150;
			yloc=100;
			xpos=50;
			ypos=60;
			gesture=1;
			carspeed=100;
			personspeed=60;
			midPosition=false;
		    
			//this is the beginning of the inner class
			class MouseClickListener implements MouseListener
			{
				public void mousePressed(MouseEvent event)
				{
					 xloc = event.getX();
					 yloc = event.getY();
					
					repaint();
					
				}
				
				public void mouseReleased(MouseEvent event)
				{
					 xpos = event.getX();
					 ypos = event.getY();
					
					repaint();
					
				}
				// do-nothing methods
				public void mouseEntered(MouseEvent event){}
				public void mouseClicked(MouseEvent event){}
				public void mouseExited(MouseEvent event){}
			}
		    //This is the end of the inner class	
			
			MouseListener sse = new MouseClickListener();
			addMouseListener(sse);
			
			
			//Add a Button Interface
			final JTextField xField = new JTextField(5);
			final JTextField yField = new JTextField(5);
			
			
			//Button
			JButton moveButton = new JButton("move");
			JButton stopButton = new JButton("stop");
            JButton jumpButton = new JButton("jump");			
			
			class MoveButtonListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event) 
				{
					//xloc = Integer.parseInt(xField.getText());
					//yloc = Integer.parseInt(yField.getText());
					
					if (midPosition==true)
						midPosition = false;
					else
						midPosition = true;
					
					xpos=xpos-personspeed/2;	
					xloc=xloc-carspeed/2;
					
					if (midPosition == true)
					   gesture=2;
					else 
						gesture=1;
					
					repaint();
					
					
					
					/*
					try {
						myWait (100);
					} catch (InterruptedException e){} 
					
					xpos=xpos-personspeed/2;	
					xloc=xloc-carspeed/2;
					gesture=1;
					repaint();
					*/
				}
				
				public void myWait (long time) throws InterruptedException 
				{
					wait (time);
				}
			};
			
			ActionListener listener = new MoveButtonListener();
			moveButton.addActionListener(listener);
			
			
			// the labels
			JLabel xlocLabel = new JLabel("x = ");
			JLabel ylocLabel = new JLabel("y = ");
			
			
			//Panels
			JPanel panel = new JPanel();
			
			
			panel.add(xlocLabel);
			panel.add(xField);
			panel.add(ylocLabel);
			panel.add(yField);
			panel.add(moveButton);
			panel.add(stopButton);
			panel.add(jumpButton);
			
			 //Frame
			JFrame frame = new JFrame();
			frame.setContentPane(panel);
			frame.pack();
		    frame.show();
		   
			//throws HeadlessException
		}
				
		
		public void drawCar (Graphics2D g2, Color clr)
		{     
					
			//Graphics2D g2 = (Graphics2D)g;
			
			g2.setColor(clr);
			Rectangle2D.Double carbody = new Rectangle2D.Double(xloc-30 , yloc , 60, 10);
			g2.fill(carbody);
			
			g2.setColor(Color.black);
			Ellipse2D.Double frontwheel = new Ellipse2D.Double(xloc-20,yloc+10, 10, 10);
			g2.fill(frontwheel);
		
			Ellipse2D.Double backwheel = new Ellipse2D.Double(xloc+10,yloc+10, 10, 10);
			g2.fill(backwheel);
			
			g2.setColor(Color.black);
		
			Line2D.Double line1 = new Line2D.Double(xloc-20, yloc,xloc-10,yloc-10);
		    g2.draw(line1);
		    
		    Line2D.Double line2 = new Line2D.Double(xloc-10,yloc-10,xloc+10,yloc-10);
		    g2.draw(line2);
		    
		    Line2D.Double line3 = new Line2D.Double(xloc +10,yloc-10,xloc+20,yloc);
		    g2.draw(line3);
		  }
		
		
		
		public void drawPerson (Graphics2D g2, int my_x, int my_y, Color clr, int gesture)
		{
		   if (gesture == 1)
		   {
			 Rectangle2D.Double carbody = new Rectangle2D.Double(my_x-10 , my_y, 10, 20);
			 g2.setColor(clr);
			 g2.fill(carbody);
					
			 Ellipse2D.Double frontwheel = new Ellipse2D.Double(my_x-10,my_y-10, 10, 10);
			 g2.setColor(clr);
			 g2.fill(frontwheel);
		
			 Line2D.Double line1 = new Line2D.Double(my_x-10, my_y,my_x-20,my_y+10);
		     g2.draw(line1);
		     
			 Line2D.Double line33 = new Line2D.Double(my_x-20, my_y,my_x-20,my_y+10);
		     g2.draw(line33);
		 	    
		     Line2D.Double line2 = new Line2D.Double(my_x,my_y,my_x+10,my_y+10);
		     g2.draw(line2);
		     
		     Line2D.Double line345 = new Line2D.Double(my_x+10,my_y+10,my_x+10,my_y+20);
		     g2.draw(line345);
		    
		     Line2D.Double line3 = new Line2D.Double(my_x-10,my_y+20,my_x-20,my_y+30);
		     g2.draw(line3);
		     
		     Line2D.Double line099 = new Line2D.Double(my_x-20,my_y+30,my_x-20,my_y+40);
		     g2.draw(line099);
		    
		     Line2D.Double line4 = new Line2D.Double(my_x,my_y+20,my_x+10,my_y+30);
		     g2.draw(line4);
		     
		     Line2D.Double line8848 = new Line2D.Double(my_x+10,my_y+30,my_x+10,my_y+40);
		     g2.draw(line8848);
		   }    
		   else if(gesture == 2)
		   {			    
		     Rectangle2D.Double Ears = new Rectangle2D.Double(my_x-10 , my_y , 10, 20);
		     g2.setColor(clr);
			 g2.fill(Ears);
				
			 Ellipse2D.Double body = new Ellipse2D.Double(my_x-10,my_y-10, 10, 10);
			 g2.setColor(clr);
			 g2.fill(body);
		
			 Line2D.Double line = new Line2D.Double(my_x-10, my_y,my_x-20,my_y+10);
		     g2.draw(line);
		    
		     Line2D.Double lala = new Line2D.Double(my_x-20, my_y+10,my_x-30,my_y);
		     g2.draw(lala);
		    
		     Line2D.Double line7 = new Line2D.Double(my_x,my_y,my_x+10,my_y+10);
		     g2.draw(line7);
		    
		     Line2D.Double eees = new Line2D.Double(my_x+10, my_y+10,my_x+10,my_y+20);
		     g2.draw(eees);
		    
		     Line2D.Double line0 = new Line2D.Double(my_x-10,my_y+20,my_x-20,my_y+30);
		     g2.draw(line0);
		   
		     Line2D.Double line8 = new Line2D.Double(my_x-20,my_y+30,my_x-10,my_y+40);
		     g2.draw(line8);
		    
		     Line2D.Double line9 = new Line2D.Double(my_x,my_y+20,my_x+10,my_y+30);
		     g2.draw(line9);
		    
		     Line2D.Double line6 = new Line2D.Double(my_x+10,my_y+30,my_x+20,my_y+20);
		     g2.draw(line6);
		   }
		   else if(gesture == 3)
		   {
		     Rectangle2D.Double carp = new Rectangle2D.Double(my_x-20 , my_y-20 , 20, 10);
		     g2.setColor(clr);
			 g2.fill(carp);
			
			
			 Ellipse2D.Double eeee = new Ellipse2D.Double(my_x-30,my_y-20, 10, 10);
			 g2.setColor(clr);
			 g2.fill(eeee);
		
			 Line2D.Double wwww = new Line2D.Double(my_x-20, my_y-10,my_x-10,my_y);
		     g2.draw(wwww);
		    
		     Line2D.Double kkkk = new Line2D.Double(my_x-20,my_y-20,my_x-10,my_y-30);
		     g2.draw(kkkk);
		    
		     Line2D.Double waas = new Line2D.Double(my_x,my_y-10,my_x+10,my_y);
		     g2.draw(waas);
		   
		     Line2D.Double line10 = new Line2D.Double(my_x,my_y-20,my_x+10,my_y-10);
		     g2.draw(line10);
		   }
		}
		  
		public void paint (Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
		    drawCar (g2, Color.yellow);
		    		    
		    
		    if(Math.abs(xloc-xpos)<30)
		    	drawPerson (g2, xpos, ypos, Color.red, 3);
		    else
		    	drawPerson (g2, xpos, ypos, Color.blue, gesture);
		    
		    	
		   			
		}
	private	int xloc;
	private	int yloc;
	private int xpos;
	private int ypos;
	private int gesture;
	private int carspeed;
	private int personspeed;
	private boolean midPosition;
}
