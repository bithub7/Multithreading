package V1;

public class Main {

    public static void main(String[] args) {

        Foo foo = new Foo();

        Thread c_thread = new C_Thread(foo);
        Thread b_thread = new B_Thread(foo);
        Thread a_thread = new A_Thread(foo);

        c_thread.start();
        b_thread.start();
        a_thread.start();

    }
}
