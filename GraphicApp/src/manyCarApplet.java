import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class manyCarApplet extends Applet
{
	public manyCarApplet()throws HeadlessException 
	{
		//throws HeadlessException
		
	}
	
	public void drawCar (Graphics2D g2, int xloc, int yloc, Color clr)
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
		
		g2.setColor(Color.blue);
	
		Line2D.Double line1 = new Line2D.Double(xloc-20, yloc,xloc-10,yloc-10);
	    g2.draw(line1);
	    
	    Line2D.Double line2 = new Line2D.Double(xloc-10,yloc-10,xloc+10,yloc-10);
	    g2.draw(line2);
	    
	    Line2D.Double line3 = new Line2D.Double(xloc+10,yloc-10,xloc+20,yloc);
	    g2.draw(line3);
	  }

	public void paint (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		drawCar (g2, 150, 100, Color.yellow);
		drawCar (g2, 100, 50, Color.red);
	}


}
