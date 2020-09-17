import java.io.*;
import java.net.*;

class S_Slip1_1{
    public static void main(String a[]) throws Exception {
        ServerSocket ss = new ServerSocket(1000);
        System.out.println("Server is waiting for client: ");
        Socket s = ss.accept();
        System.out.println("Client has been connected");
    }
}