package command;

/**
 * Concrete Command for turning on SmartLights.
 * 
 * This class binds the action of turning on lights
 * to a command object, decoupling the invoker from 
 * the actual device implementation.
 */


import observer.SmartLight;

public class TurnOnLightCommand implements Command{
    
    private SmartLight lights;

    public TurnOnLightCommand(SmartLight lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }

    @Override
    public void undo() {
        lights.turnOff(); 
    }
}
