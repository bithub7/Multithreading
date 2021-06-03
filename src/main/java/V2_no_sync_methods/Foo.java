package V2_no_sync_methods;

public class Foo {

    private boolean b_bool = false;
    private boolean c_bool = false;

    public boolean isB_bool() {
        return b_bool;
    }

    public void setB_bool(boolean b_bool) {
        this.b_bool = b_bool;
    }

    public boolean isC_bool() {
        return c_bool;
    }

    public void setC_bool(boolean c_bool) {
        this.c_bool = c_bool;
    }

    public void first() {
        System.out.println("first");
    }

    public void second() {
        System.out.println("second");
    }

    public void third() {
        System.out.println("third");
    }
}

