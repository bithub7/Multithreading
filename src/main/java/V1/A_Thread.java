package V1;

public class A_Thread extends Thread{

    private Foo foo;
    private Thread b_thread;

    public A_Thread(Foo foo, Thread b_thread){
        this.foo = foo;
        this.b_thread = b_thread;
    }

    public synchronized void run(){

        foo.first();

        synchronized(b_thread) {
            b_thread.notify();
        }

    }
}
