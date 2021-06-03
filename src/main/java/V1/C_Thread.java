package V1;

public class C_Thread extends Thread{

    private Foo foo;

    public C_Thread(Foo foo){
        this.foo = foo;
    }

    public synchronized void run(){

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        foo.third();

    }
}
