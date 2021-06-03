package V2_no_sync_methods;

public class C_Thread extends Thread{

    private Foo foo;

    public C_Thread(Foo foo){
        this.foo = foo;
    }

    public void run(){

        while(!foo.isC_bool()){}

        foo.third();

    }
}
