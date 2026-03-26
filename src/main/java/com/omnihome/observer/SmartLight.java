package observer;

/**
 * Concrete Observer representing smart lighting.
 * 
 * Reacts to motion detection events by turning lights on.
 * Also exposes manual control methods used by Command pattern.
 */

public class SmartLight implements Observer {

    @Override
    public void update() {
        System.out.println("Lights turned ON due to motion.");
    }

    public void turnOn() {
        System.out.println("Lights manually turned ON.");
    }

    public void turnOff(){
        System.out.println("Lights turned OFF.");
    }
}
