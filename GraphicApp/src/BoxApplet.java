import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class BoxApplet extends Applet {

	public BoxApplet() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}
	
	public void paint (Graphics g)
	{
		Rectangle myBox = new Rectangle(5,10,20,30);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(myBox);
		
		myBox.translate(40,50);
		g2.draw(myBox);
		
		Ellipse2D.Double myEgg = new Ellipse2D.Double(100,20,10,20);
		g2.draw(myEgg);
		
		Ellipse2D.Double egg1 = new Ellipse2D.Double(5,10,20,30);
		g2.setColor(Color.magenta);
		g2.draw(egg1);
		
		Ellipse2D.Double egg2 = new Ellipse2D.Double(45,65,20,20);
		g2.draw(egg2);
		
		Line2D.Double line1 = new Line2D.Double(10,100,20,90);
	    g2.setColor(Color.green);
	    g2.draw(line1);
	    
	    Line2D.Double line2 = new Line2D.Double(20,90,30,120);
	    g2.draw(line2);
	    
		
	}

}