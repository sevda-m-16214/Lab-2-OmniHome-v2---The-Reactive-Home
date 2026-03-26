/**
 * Observer interace in the Observer Pattern.
 * 
 * Any class that wants to receive updates from a Subject
 * must implement this interface
 * 
 * Promotes loose coupling by allowing subjects to notify 
 * observer without knowing their concrete types.
 */


package observer;

public interface Observer {
    void update();
}
