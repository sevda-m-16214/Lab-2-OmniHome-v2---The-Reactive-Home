package main;

import observer.*;
import command.*;


public class Main {
    public static void main(String[] args) {

        // Observer + Strategy Test
        MotionSensor sensor = new MotionSensor();
        SmartLight lights = new SmartLight();
        SmartAlarm alarm = new SmartAlarm();

        alarm.setStrategy("SILENT");

        sensor.addObserver(lights);
        sensor.addObserver(alarm);

        alarm.arm();

        sensor.detectMotion();

        alarm.setStrategy("SIREN");

        sensor.detectMotion();

        // Command Test
        SmartRemote remote = new SmartRemote(2);

        Command lightOn = new TurnOnLightCommand(lights);
        Command armAlarm = new ArmAlarmCommand(alarm);


        remote.setCommand(0, lightOn);
        remote.setCommand(1, armAlarm);

        remote.pressButton(0); // Light ON
        remote.pressButton(1); // Alarm armed

        remote.pressUndo(); // Alarm

    }
}
