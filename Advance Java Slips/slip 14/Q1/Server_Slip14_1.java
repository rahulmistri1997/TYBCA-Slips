//Write a client server programs which displays the server machines date and time on the client machine

// Server_Slip14_1

import java.net.*;
import java.io.*;
import java.util.Date;

public class Server_Slip14_1
{
	public static void main(String a[]) throws UnknownHostException, IOException
	{
		ServerSocket ss = new ServerSocket(4444);
		System.out.println("Server started");
		Socket s = ss.accept();
		System.out.println("Client Connected");
		Date d = new Date();
		int m=d.getMonth();
		m=m+1;
		int y = d.getYear();
		y=y+1900;
		String time=""+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+" Date is"+d.getDate()+"/"+m+"/"+y;
		OutputStream os=s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF(time);
	}
}