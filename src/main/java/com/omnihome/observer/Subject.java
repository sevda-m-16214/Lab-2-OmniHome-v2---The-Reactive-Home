/**
 * Subject interface in the Observer Pattern.
 * 
 * Defines the contract for any observable entity that maintains
 * a list of observers anf notifies them of state changes.
 * 
 * Ensures loose coupling between the event source and its subscribers.
 */


package observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}