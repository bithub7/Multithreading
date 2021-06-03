package V1;

public class B_Thread extends Thread{

    private Foo foo;
    private Thread c_thread;

    public B_Thread(Foo foo, Thread c_thread){
        this.foo = foo;
        this.c_thread = c_thread;
    }

    public synchronized void run(){

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        foo.second();
        synchronized(c_thread) {
            c_thread.notify();
        }

    }
}
