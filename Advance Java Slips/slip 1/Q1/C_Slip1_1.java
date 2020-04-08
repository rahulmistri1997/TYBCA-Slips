
//CLIENT:
import java.io.*;
import java.net.*;

class C_Slip1_1 {
    public static void main(String a[]) throws Exception {
        Socket ss = new Socket("localhost", 1000);
        System.out.println("IP Address = " + ss.getInetAddress());
        System.out.println("Client port = " + ss.getPort());
    }
}