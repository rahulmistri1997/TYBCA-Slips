import java.applet.Applet;
import java.io.*;
import java.awt.*;
import java.util.*;
public class Smile extends Applet implements Runnable
{
Thread t;
int x=0;

public void run()
{
repaint();
}

public void init()
{
Smile s1=new Smile();
t=new Thread(s1);
t.start();
setSize(500,500);
setBackground(Color.blue);
}

public void paint(Graphics g)
{
if(x==0)
{
g.drawOval(40,40,130,130);
g.drawOval(57,75,20,20);
g.drawOval(110,75,20,20);
g.drawArc(60,110,80,40,180,180);
x=1;
}
else if(x==1)
{
g.drawOval(40,40,130,130);
g.drawOval(57,75,20,20);
g.drawOval(110,75,20,20);
g.drawArc(60,110,80,40,-180,-180);
x=0;
}
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
e.printStackTrace();
}
repaint();
}
}