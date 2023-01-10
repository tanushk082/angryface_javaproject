import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code ="Angry" width=700 height=700>
</applet>*/

public class Angry extends Applet implements ActionListener{
int y= 0;
int x=0;
    Thread t;
  Button leftButton;
  Button rightButton;
  Button upButton;
  Button downButton;
  Button resetButton;
public void init() {
    // create the buttons
    leftButton = new Button("Move Left");
    rightButton = new Button("Move Right");
    upButton = new Button("Move Up");
    downButton = new Button("Move Down");
    resetButton = new Button("Reset");

    // add the buttons to the applet
    add(leftButton);
    add(rightButton);
    add(upButton);
    add(downButton);
    add(resetButton);


    // add action listeners to the buttons
    leftButton.addActionListener(this);
    rightButton.addActionListener(this);
    upButton.addActionListener(this);
    downButton.addActionListener(this);
    resetButton.addActionListener(this);

    // set the size of the applet window
    setSize(700,700);
  }

    public void paint(Graphics g)
    {

g.setColor (Color.red);
        g.fillOval(80+x, 70+y, 150, 150);
        
        g.setColor(Color.BLACK);
        g.fillOval(120+x, 120+y, 15, 15);
        g.fillOval(170+x, 120+y, 15, 15);

        	//g.drawArc(130+x, 180+y, 50, 20, 180, 180);
g.drawLine (130+x,180+y, 180+x, 180+y);
    }

   
public void actionPerformed(ActionEvent e) {
    // move the snowman based on which button was clicked
    if (e.getSource() == leftButton) {
      x-= 10;

    } else if (e.getSource() == rightButton) {
      x+= 10;
    } else if (e.getSource() == upButton) {
      y-= 10;
    } else if (e.getSource() == downButton) {
      y+= 10;
    }else if (e.getSource()==resetButton){
	x=0;
	y=0;
}

repaint();  }
}