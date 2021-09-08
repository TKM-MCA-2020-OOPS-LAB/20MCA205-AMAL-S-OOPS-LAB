import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class co5_q6 extends Applet implements ItemListener {
    Choice choice;
    int c; 
public void init()
    {
        choice = new Choice();
        choice.addItem("SHAPES");
        choice.addItem("Rectangle");
        choice.addItem("Square");
        choice.addItem("Pentagon");
        choice.addItem("Circle");
        choice.addItem("Triangle");
        add(choice);
        choice.addItemListener(this);
    }

public void itemStateChanged (ItemEvent e)
    {
         c= choice.getSelectedIndex();
         repaint();
    }

public void paint(Graphics g)
	{
         super.paint(g);

         if (c == 1)
         {  
            g.drawString("Shape:"+choice.getItem(1),190,130);
            g.drawRect(150,170,150,150);
            g.setColor(Color.green);
            g.fillRect(150,170,150,150);
         }
         if (c == 2)
         {
             g.drawString("Shape:"+choice.getItem(2),200,230);
             g.drawRect(300,200,50,50);
             g.setColor(Color.decode("#33D0FF"));
             g.fillRect(300,200,50,50);
         }
         if (c == 3)
         {
             g.drawString("Shape:"+choice.getItem(3),50,250);
             int [] x= { 260, 498, 407, 113, 22 };
             int [] y= { 10, 183, 462, 462, 183 };
             g.drawPolygon(x,y,5);
             g.setColor(Color.decode("#FF3333"));
             g.fillPolygon(x,y,5);

          }  
         if (c == 4)
         {
             g.drawString("Shape:"+choice.getItem(4),190,130);
             g.drawOval(170,170,100,100);
             g.setColor(Color.decode("#800080"));
             g.fillOval(170,170,100,100);
         }
         if (c == 5)
         {
             g.drawString("Shape:"+choice.getItem(5),50,250);
             int[] x={200,300,100};
             int[] y={200,300,300};
             g.drawPolygon(x,y,3);
             g.setColor(Color.yellow);
             g.fillPolygon(x,y,3);

         }
          
	}

}
/*
<applet code="co5_q6.class" width="500" height="500" border="20">
</applet>
*/