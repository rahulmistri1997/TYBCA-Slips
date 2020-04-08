import java.io.*;
import java.net.*;

class Server {
    public static void main(final String args[]) throws Exception {
        final ServerSocket ss = new ServerSocket(7080);
        while (true) {
            final Socket s = ss.accept();
            final DataOutputStream toClient = new DataOutputStream(s.getOutputStream());
            final DataInputStream fromClient = new DataInputStream(s.getInputStream());
            final String fileName = fromClient.readLine();
            final File f = new File(fileName);
            if (f.exists()) {
                String str = null;
                final DataInputStream dis = new DataInputStream(new FileInputStream(f));
                while ((str = dis.readLine()) != null) {
                    toClient.writeBytes(str + "\n");
                }
            } else {
                toClient.writeBytes("File " + fileName + " not found.\n");
            }
            toClient.writeBytes("END\n");
        }
    }
}