package observer;

import java.util.HashMap;
import java.util.Map;

import strategy.AlertStrategy;
import strategy.LoudSirenStrategy;
import strategy.SilentPushStrategy;

/**
 * Concrete Observer representing a smart alarm system
 * 
 * Combines Observer and Strategy patterns:
 * - Act as an obvserver to motion events
 * - Delegate alert behaviour to a pluggable AlertStrategy
 */

public class SmartAlarm implements Observer{
    
    private AlertStrategy currentStrategy;

    private Map<String, AlertStrategy> strategyRegistry = new HashMap<>();

    private boolean armed = false;

    public SmartAlarm() {
        strategyRegistry.put("SILENT", new SilentPushStrategy());
        strategyRegistry.put("SIREN", new LoudSirenStrategy());
    }

    public void setStrategy(String key) {
        this.currentStrategy = strategyRegistry.get(key);
    }

    @Override
    public void update() {
        if (armed && currentStrategy != null) {
            currentStrategy.executeAlert();
        } else {
            System.out.println("Alarm is disarmed. No alert triggered.");
        }
    }

    public void arm() {
        armed = true;
        System.out.println("Alarm armed.");
    }

    public void disarm() {
        armed = false;
        System.out.println("Alarm disarmed.");
    }
}
