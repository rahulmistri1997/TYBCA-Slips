import java.io.*;
import java.net.*;

class Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 7080);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file name:");
        String fileName = br.readLine();
        DataInputStream fromServer = new DataInputStream(s.getInputStream());
        DataOutputStream toServer = new DataOutputStream(s.getOutputStream());
        toServer.writeBytes(fileName + "\n");
        String str = "";
        while (true) {
            str = fromServer.readLine();
            if (str.equals("END"))
                break;
            System.out.println(str);
        }
    }
}