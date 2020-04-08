import java.net.*;
import java.io.*;
public class server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss =new ServerSocket(2222);
            System.out.println("Server is started");
            while(true)
            {
                Socket s=ss.accept();
                System.out.print("Connection request Received");
                InputStream is=s.getInputStream();
                InputStreamReader isr= new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                OutputStream os=s.getOutputStream();
                PrintWriter pw= new PrintWriter(os,true);
                String no= br.readLine();
                //System.out.print("no:"+ " " + (char)no);
                int no1=Integer.parseInt(no);
                int fact=1,i=0;
                while(no1>i)
                {
                    fact=fact*no1;
                    no1--;
                    //System.out.println("fact="+fact+"no="+no1);
                }
                pw.println(fact);
                s.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}