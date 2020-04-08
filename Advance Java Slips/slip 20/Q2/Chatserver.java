import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

class ChatServer extends Frame{
            private TextArea taMsgs;
            private TextField txtMsg;
            private Button btnSend;
            private Panel panSouth;

            private MyThread t;
           
            private Socket s;
            private ServerSocket ss;

            private DataInputStream fromClient;
            private DataOutputStream toClient;

            public ChatServer(){
                        taMsgs = new TextArea();

                        txtMsg = new TextField(40);
                        btnSend = new Button("Send");

                        panSouth = new Panel();
                        panSouth.add(txtMsg);
                        panSouth.add(btnSend);

                        setTitle("Server");
                        setSize(300,400);
                        setLocation(100,100);
                        add(taMsgs,"Center");
                        add(panSouth,"South");
                        setVisible(true);

                        addWindowListener(new WindowAdapter(){
                                    public void windowClosing(WindowEvent we){
                                                System.exit(0);
                                    }
                        });

                        try{
                                    ss = new ServerSocket(5060);

                                    s = ss.accept();

                                    fromClient = new DataInputStream(s.getInputStream());
                                    toClient = new DataOutputStream(s.getOutputStream());
                       
                                    t = new MyThread();
                                    t.start();
                        }
                        catch(Exception e){
                                    System.out.println(e);
                                    System.exit(0);
                        }

                        btnSend.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent ae){
                                                try{
                                                            String str = txtMsg.getText();
                                                            toClient.writeBytes(str+"\n");
                                                            taMsgs.append("Me:"+str+"\n");
                                                            txtMsg.setText("");
                                                            txtMsg.requestFocus();
                                                }catch(Exception e){}
                                    }
                        });
            }


            class MyThread extends Thread{
                        public void run(){
                                    while(true){
                                                try{
                                                            String str = fromClient.readLine();
                                                            if(str!=null)
                                                                        taMsgs.append("You:"+str+"\n");
                                                }catch(Exception e){}
                                    }
                        }
            }

            public static void main(String args[]){
                        new ChatServer();
            }
}