import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CarApplet extends Applet 
{

	public CarApplet() throws HeadlessException 
	{
		//throws HeadlessException
	}
	
	public void paint (Graphics g)
	{
		// car body
		Rectangle myBox = new Rectangle(100,110,60,10);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(myBox);
		g2.setColor(Color.yellow);
		g2.fill(myBox);
		
		// front wheel 
		Ellipse2D.Double myEgg = new Ellipse2D.Double(110,120,10,10);
		g2.draw(myEgg);
		g2.setColor(Color.green);
		g2.fill(myEgg);
		
		
		
		// back wheel
		Ellipse2D.Double egg1 = new Ellipse2D.Double(140,120,10,10);
		g2.draw(egg1);
		g2.setColor(Color.blue);
		g2.fill(egg1);
		
		// top
		 g2.setColor(Color.pink);
		Line2D.Double line1 = new Line2D.Double(110,110,120,100);
	    g2.draw(line1);
	    
	    Line2D.Double line2 = new Line2D.Double(120,100,140,100);
	    g2.draw(line2);
	    
	    Line2D.Double line3 = new Line2D.Double(140,100,150,110);
	    g2.draw(line3);
	    
	    
		
	}
}

