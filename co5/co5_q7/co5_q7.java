import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class co5_q7 extends Applet implements MouseListener
{
	String msg="Initial Message";
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		msg = "Mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg = "Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		msg = "Mouse Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		msg = "Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg = "Mouse Exited";
		repaint();
	}
	public void paint(Graphics g)
	{
                g.setColor(Color.blue);
		g.drawString(msg,20,20);
	}
}

/*
<applet code="co5_q7" width=500 height=400>
</applet>
*/