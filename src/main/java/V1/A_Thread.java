package V1;

public class A_Thread extends Thread{

    private Foo foo;

    public A_Thread(Foo foo){
        this.foo = foo;
    }

    public synchronized void run(){

        foo.first();

    }
}
