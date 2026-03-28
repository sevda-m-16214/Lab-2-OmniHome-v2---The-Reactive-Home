package command;

/**
 * Command interface in the Command Pattern.
 * 
 * Encapsulates a request as an object, allowing parametrization
 * of clients with different requests, queuing of requests,
 * and support for undoable operations.
 */


public interface Command {
    void execute();
    void undo();
}
