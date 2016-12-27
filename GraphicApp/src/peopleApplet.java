import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class peopleApplet extends Applet
{
	public peopleApplet()throws HeadlessException 
	{
		//throws HeadlessException
		
	}
	 public void drawPerson (Graphics2D g2, int xloc, int yloc, Color clr, int gesture)
	{     
				
		//Graphics2D g2 = (Graphics2D)g;
			
	  if (gesture == 1)
	  {
		Rectangle2D.Double carbody = new Rectangle2D.Double(xloc-10 , yloc , 10, 20);
		g2.setColor(Color.blue);
		g2.fill(carbody);
		
		
		Ellipse2D.Double frontwheel = new Ellipse2D.Double(xloc-10,yloc-10, 10, 10);
		g2.setColor(Color.yellow);
		g2.fill(frontwheel);
	
		Line2D.Double line1 = new Line2D.Double(xloc-10, yloc,xloc-20,yloc+10);
	    g2.draw(line1);
	 
	    
	    Line2D.Double line2 = new Line2D.Double(xloc,yloc,xloc+10,yloc+10);
	    g2.draw(line2);
	    
	    Line2D.Double line3 = new Line2D.Double(xloc-10,yloc+20,xloc-20,yloc+30);
	    g2.draw(line3);
	    
	    Line2D.Double line4 = new Line2D.Double(xloc,yloc+20,xloc+10,yloc+30);
	    g2.draw(line4);
	  }
	  else if (gesture == 2)
	  {
	    
	    
	    
	    
	    
	    Rectangle2D.Double cars = new Rectangle2D.Double(xloc-10 , yloc , 10, 20);
	    g2.setColor(Color.red);
		g2.fill(cars);
		
		
		Ellipse2D.Double body = new Ellipse2D.Double(xloc-10,yloc-10, 10, 10);
		g2.setColor(Color.orange);
		g2.fill(body);
	
		Line2D.Double line = new Line2D.Double(xloc-10, yloc,xloc-20,yloc+10);
	    g2.draw(line);
	    
	    Line2D.Double lala = new Line2D.Double(xloc-20, yloc+10,xloc-30,yloc);
	    g2.draw(lala);
	    
	    Line2D.Double line7 = new Line2D.Double(xloc,yloc,xloc+10,yloc+10);
	    g2.draw(line7);
	    
	    Line2D.Double eees = new Line2D.Double(xloc+10, yloc+10,xloc+10,yloc+20);
	    g2.draw(eees);
	    
	    Line2D.Double line0 = new Line2D.Double(xloc-10,yloc+20,xloc-20,yloc+30);
	    g2.draw(line0);
	   
	    Line2D.Double line8 = new Line2D.Double(xloc-20,yloc+30,xloc-10,yloc+40);
	    g2.draw(line8);
	    
	    Line2D.Double line9 = new Line2D.Double(xloc,yloc+20,xloc+10,yloc+30);
	    g2.draw(line9);
	    
	    Line2D.Double line6 = new Line2D.Double(xloc+10,yloc+30,xloc+20,yloc+20);
	    g2.draw(line6);
	  }
	    
	   else if(gesture == 3)
	   {
	    Rectangle2D.Double carp = new Rectangle2D.Double(xloc-20 , yloc-20 , 20, 10);
	    g2.setColor(Color.green);
		g2.fill(carp);
		
		
		Ellipse2D.Double eeee = new Ellipse2D.Double(xloc-30,yloc-20, 10, 10);
		g2.setColor(Color.magenta);
		g2.fill(eeee);
	
		Line2D.Double wwww = new Line2D.Double(xloc-20, yloc-10,xloc-10,yloc);
	    g2.draw(wwww);
	    
	    Line2D.Double kkkk = new Line2D.Double(xloc-20,yloc-20,xloc-10,yloc-30);
	    g2.draw(kkkk);
	    
	    Line2D.Double waas = new Line2D.Double(xloc,yloc-10,xloc+10,yloc);
	    g2.draw(waas);
	   
	    Line2D.Double line10 = new Line2D.Double(xloc,yloc-20,xloc+10,yloc-10);
	    g2.draw(line10);
	   }  
	}

	public void paint (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		drawPerson (g2, 50, 50, Color.yellow, 1);
		drawPerson (g2, 100, 100, Color.blue, 2);
		drawPerson (g2, 100, 200, Color.green, 3);
		 

	}


}
