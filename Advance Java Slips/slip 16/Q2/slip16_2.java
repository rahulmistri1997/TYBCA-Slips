class MyThread extends Thread{

    public MyThread(String s){
                super(s);
    }

    public void run(){
                System.out.println(getName()+" thread created.");
                while(true){
                            System.out.println(this);
                            int s = (int)(Math.random()*5000);
                            System.out.println(getName()+" is sleeping for "+s+"msec");
                            try{
                                        Thread.sleep(s);
                            }catch(Exception e){}
                }
    }
}

class ThreadLifeCycle{
    public static void main(String args[]){
                MyThread t1 = new MyThread("Rahul"),
                            t2 = new MyThread("Ron");
                t1.start();
                t2.start();

                try{
                            t1.join();
                            t2.join();
                }catch(Exception e){}

                System.out.println(t1.getName()+" thread dead.");
                System.out.println(t2.getName()+" thread dead.");
    }
}