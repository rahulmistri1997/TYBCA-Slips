//SLIP 4: Write a java program to display "Hello Java" message n times on the screen. (Use Runnable Interface).

import java.io.*;
public class slip4_1 implements Runnable{
   
    int i,no;
   
    slip4_1(int n)
    {
        no = n;
    }
    public void run()
    {
        for(i = 1; i<=no; i++)
        {
            System.out.println("\nHello Java");
           
            try
            {
                Thread.sleep(50);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
   
    public static void main(String args[])
    {
        try
        {
        int n;
       
        System.out.println("\nEnter Number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);
        Thread t = new Thread(new slip4_1(n));
        t.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}