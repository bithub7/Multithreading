package V2_no_sync_methods;

public class B_Thread extends Thread{

    private Foo foo;

    public B_Thread(Foo foo){
        this.foo = foo;
    }

    public void run(){

        while(!foo.isB_bool()){}

        foo.second();

        foo.setC_bool(true);


    }
}
