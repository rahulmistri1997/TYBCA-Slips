// client_slip14_1

import java.net.*;
import java.io.*;
import java.util.*;
public class Client_Slip14_1
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localhost",4444);
		DataInputStream dos = new DataInputStream(s.getInputStream());
		String time = dos.readUTF();
		System.out.println("Current date and time is "+time);
	}
}