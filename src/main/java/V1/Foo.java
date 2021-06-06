package V1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    private boolean second_bool = false;
    private boolean third_bool = false;
    private Lock locker = new ReentrantLock();
    private Condition condition = locker.newCondition();

    public void first() {

        locker.lock();

        System.out.println("first");

        second_bool = true;

        condition.signalAll();
        locker.unlock();

    }

    public void second() {
        locker.lock();
        try {
            while(!second_bool) {
                condition.await();
        }

        System.out.println("second");

        second_bool = false;
        third_bool = true;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            condition.signalAll();
            locker.unlock();
        }
    }

    public void third() {
        locker.lock();

        try {
            while(!third_bool) {
                condition.await();
        }

        System.out.println("third");

        third_bool = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            condition.signalAll();
            locker.unlock();
        }
    }
}

