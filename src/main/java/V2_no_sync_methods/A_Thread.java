package V2_no_sync_methods;

public class A_Thread extends Thread{

    private Foo foo;

    public A_Thread(Foo foo){
        this.foo = foo;
    }

    public void run(){

        foo.first();

        foo.setB_bool(true);

    }
}
