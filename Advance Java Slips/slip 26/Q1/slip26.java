//Slip26 Q1. Write a Multithreading program in java to display all the alphabets from A to Z after 3 seconds.

import java.io.*;
import java.util.*;
class slip26 implements Runnable
{
            Thread t;
            public slip26()
            {
                        t=new Thread(this);
                        t.start();
                       
            }
            public  void run()
            {
                        char ch;
                        for (ch='a';ch<='z';ch++)
                        {
                                    System.out.println(ch);
                                    try
                                    {
                                       Thread.sleep(300);  
                                    }
                                    catch(Exception e)
                                    {
                                    }
                        }
            }
            public static void main (String[] args)
            {
                new slip26();
                //new run();
            }
}