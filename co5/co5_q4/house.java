import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;
public class house extends Applet implements MouseListener
{
int a,b;
public void init()
{
addMouseListener(this);
}
public void paint(Graphics g){ 
      int [] x = {150, 300, 225};
      int [] y = {150, 150, 25};
      g.drawRect(150, 150, 150, 200); //house
      g.setColor(Color.decode("#00FFFF"));
      g.fillRect(150,150,150,200);
      g.drawRect(200, 200, 50, 150); //door
      g.setColor(Color.decode("#A52A2A"));
      g.fillRect(200,200,50,150);
      g.drawPolygon(x, y, 3); //roof
      g.setColor(Color.red);
      g.fillPolygon(x,y,3);
if(a>200 && a<300 && b>200 && b<300)
        {
            g.setColor(Color.decode("#800080"));
            g.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e){
        a=e.getX();
        b=e.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent e){

    }
 }
/*
<applet code="house.class" width=500 height=450>
</applet>
*/
                                                                                    