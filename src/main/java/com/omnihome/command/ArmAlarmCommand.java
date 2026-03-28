package command;

/**
 * Concrete Comand for arming the SmartAlarm.
 * 
 * Encapsulates the action of arming the alarm system,
 * allowing it to be triggered by the remote without
 * direct coupling to the SmartAlarm class.
 */


import observer.SmartAlarm;

public class ArmAlarmCommand implements Command{

    private SmartAlarm alarm;

    public ArmAlarmCommand(SmartAlarm alarm) {
        this.alarm = alarm;
    }

    @Override 
    public void execute() {
        alarm.arm();
    }

    @Override
    public void undo() {
        alarm.disarm();
    }
}
