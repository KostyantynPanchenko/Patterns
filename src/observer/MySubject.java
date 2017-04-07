
package observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySubject implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MySubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void register(Observer obsvr) {
        if (obsvr == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obsvr))
                observers.add(obsvr);
        }
    }

    @Override
    public void unregister(Observer obsvr) {
        synchronized (MUTEX) {
            observers.remove(obsvr);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        // synchronization is used to make sure any observer registered after
        // message is received is not notified
        synchronized (MUTEX) {
            if (changed) {
                observersLocal = new ArrayList<>(this.observers);
                changed = false;
            } else {
                return;
            }
        }
        observersLocal.parallelStream().forEach(observer -> observer.update());
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        message = msg;
        changed = true;
        notifyObservers();
    }

}
