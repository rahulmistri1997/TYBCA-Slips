//SLIP17:   Write a java program which will display name and priority of current thread. Change name of Thread to MyThread and set the priority to 2 and display it on screen.

class slip17_1
{
            public static void main(String a[])
            {
                        String S;
                        int p;

                        Thread t = Thread.currentThread();

                        S = t.getName();
                        System.out.println("\n Current Thread name : "+S);

                        p = t.getPriority();
                        System.out.println("\n Current thread priority : "+p);

                        t.setName("My Thread");
                        S = t.getName();
                        System.out.println("\nChanged Name : "+S);

                        t.setPriority(2);
                        p = t.getPriority();
                        System.out.println("\nChanged Priority : "+p);
            }
}