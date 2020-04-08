import java.awt.*;
import java.awt.event.*;

class CounterThread extends Frame implements Runnable{
	private TextField txtCount;
	private Button btnStart;
	private int count=1;
	private Thread t;
	
	public CounterThread(){
		txtCount = new TextField(10);
		btnStart = new Button("Start");

		setTitle("Counter");
		setSize(300,400);
		setLayout(new FlowLayout());
		add(txtCount);
		add(btnStart);
		setVisible(true);

		t = new Thread(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		btnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				t.start();
			}
		});
	}

	public void run(){
		while(true){
			txtCount.setText(Integer.toString(count));
			count++;
			if(count>100) count=1;

			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	public static void main(String args[]){
		new CounterThread();
	}
}


