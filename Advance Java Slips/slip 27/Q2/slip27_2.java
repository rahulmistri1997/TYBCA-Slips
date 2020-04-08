import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class slip27_2 extends Frame implements

ActionListener,Runnable
 {
   Button start,stop;
                 TextField tf;
      int x=0,y=0;
     String msg="";

   Thread t1=new Thread(this);
      public slip27_2()
       {
             setLayout(new FlowLayout());
             start=new Button("start");
             stop=new Button("stop");
            add(start);
            add(stop);

         start.addActionListener(this);
         stop.addActionListener(this);
                  addWindowListener(new

WindowAdapter()
                     {
                        public void

windowClosing(WindowEvent e)
                         {
                           System.exit(0);
                            }
                      });
                     
                     setSize(200,200);
                     setVisible(true);
              }
 
  public void actionPerformed(ActionEvent ae)
     {
             Button btn=(Button)ae.getSource();
              if(btn==start)
              {
                  t1.start();
                 }
        

      if(btn==stop)
              {
                  t1.stop();
                 }
}


public void run()
 {
   try
   {
      while(true)
       {
          repaint();
          Thread.sleep(350);
         }
  }


catch(Exception e)
{
  }
 }

public void paint(Graphics g)
  {
           
            int sec,min,hr;
            GregorianCalendar date = new GregorianCalendar();
            sec = date.get(Calendar.SECOND);
            min = date.get(Calendar.MINUTE);
            hr = date.get(Calendar.HOUR);
            msg = hr+":"+min+":"+sec;
            g.drawString(msg,10,y+=10);
  }

  public static void main(String args[])
    {
     new slip27_2();
      }
   }