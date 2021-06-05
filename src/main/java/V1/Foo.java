package V1;

public class Foo {

    private boolean second_bool = false;
    private boolean third_bool = false;

    public  void first() {

        System.out.println("first");

        second_bool = true;
    }

    public void second() {

        while (!second_bool) {
            Thread.yield();
        }

        System.out.println("second");

        second_bool = false;
        third_bool = true;
    }

    public void third() {

        while(!third_bool) {
            Thread.yield();
        }

        System.out.println("third");

        third_bool = false;
    }
}

