//SLIP 2:  Write a multithreading program in java to display all the vowels from a given String.

import java.util.*;
import java.io.*;

class Slip2_1 extends Thread
{
            String s1;
            Slip2_1(String s)
            {           s1=s;
                        start();
           
}
            public void run()
            {
                        System.out.println("Vowels are  ");
                        for(int i=0;i<s1.length();i++)
                        {
                                    char ch=s1.charAt(i);
                                                           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                                                System.out.print(" "+ch);
                        }
            }

            public static void main(String a[]) throws Exception
            {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter a string");
                        String str=br.readLine();
                        Slip2_1 v=new Slip2_1(str);
}
}