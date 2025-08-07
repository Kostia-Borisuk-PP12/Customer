package app8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

    private final Lock lock = new ReentrantLock();

    public int modify(int num) {
        lock.lock(); // захоплення блокування
        try {
            num = num * 3;
            return num;
        } finally {
            lock.unlock(); // обов’язкове вивільнення блокування
        }
    }
}

