package V1;

public class B_Thread extends Thread{

    private Foo foo;

    public B_Thread(Foo foo){
        this.foo = foo;
    }

    public synchronized void run(){

        foo.second();

    }
}
