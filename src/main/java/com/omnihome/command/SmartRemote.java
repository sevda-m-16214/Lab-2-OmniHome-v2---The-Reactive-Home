package command;

/**
 * 
 * Invoker class in the Command Pattern.
 * 
 * Represents a programmable smart remote that triggers
 * commands without knowing the details of the receivers.
 * 
 * Maintains a history of the last executed command to support undo.
 * 
 */


public class SmartRemote {

    private Command[] slots;

    // Tracks the last executed command for undo functionality
    private Command lastCommand;

    public SmartRemote(int size) {
        slots = new Command[size];
    }

    public void setCommand(int slot, Command command) {
        slots[slot] = command;
    }

    public void pressButton(int slot) {
        if (slots[slot] != null) {
            slots[slot].execute();
            lastCommand = slots[slot];
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}