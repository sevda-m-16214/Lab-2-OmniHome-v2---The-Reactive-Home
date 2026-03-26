package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject representing a motion sensor.
 * 
 * Maintains a dynamic list of observers (smart devices)
 * and notifies them immediately when motion is detected.
 * 
 * 
 */

public class MotionSensor implements Subject{
    
    // Collection of subscribed observers (devices)
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override 
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void detectMotion(){
        System.out.println("Motion detected!");
        notifyObservers();
    }
}
