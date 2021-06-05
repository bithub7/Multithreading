package V1;

public class Foo {

    private boolean second_bool = false;
    private boolean third_bool = false;

    public synchronized void first() {

        System.out.println("first");

        second_bool = true;

        notifyAll();
    }

    public synchronized void second() {
        try {
            while(!second_bool) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("second");

        second_bool = false;
        third_bool = true;

        notifyAll();
    }

    public synchronized void third() {
        try {
            while(!third_bool) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        third_bool = false;
        System.out.println("third");
    }
}

