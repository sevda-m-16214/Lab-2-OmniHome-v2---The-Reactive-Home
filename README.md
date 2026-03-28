# OmniHome Reactive Smart System

## Overview
This project implements a reactive smart home system for OmniHome using three core behavioral design patterns:

- Observer Pattern → Event-driven communication
- Strategy Pattern → Dynamic alarm behavior
- Command Pattern → Decoupled remote control with undo functionality

The system simulates motion detection, device reactions, and remote-based control.

---

## Architecture

### 1. Observer Pattern (Event System)
- MotionSensor acts as the Subject
- SmartLight and SmartAlarm act as Observers
- When motion is detected, all subscribed devices are notified instantly

Key Benefit:
- Eliminates tight coupling between sensors and devices
- Uses push-based updates (no polling)

---

### 2. Strategy Pattern (Dynamic Alarm Behavior)
- SmartAlarm acts as the Context
- AlertStrategy defines behavior abstraction
- Concrete strategies:
  - SilentPushStrategy
  - LoudSirenStrategy

Implementation Detail:
- Uses O(1) HashMap registry for strategy lookup
- No if/else or switch statements used

---

### 3. Command Pattern (Smart Remote)
- SmartRemote acts as the Invoker
- Command interface encapsulates actions
- Concrete commands:
  - TurnOnLightCommand
  - ArmAlarmCommand

Features:
- Fully decoupled control system
- Supports undo functionality via last command tracking

---

## Project Structure
```
com.omnihome
│
|── docs
  └── OmniHome UML.png
|
├── observer/
│ ├── Subject.java
│ ├── Observer.java
│ ├── MotionSensor.java
│ ├── SmartLight.java
│ └── SmartAlarm.java
│
├── strategy/
│ ├── AlertStrategy.java
│ ├── SilentPushStrategy.java
│ └── LoudSirenStrategy.java
│
├── command/
│ ├── Command.java
│ ├── TurnOnLightCommand.java
│ ├── ArmAlarmCommand.java
│ └── SmartRemote.java
│
└── main/
└── Main.java
```

---

## How to Run

1. Compile the project:

```javac com/omnihome/**/*.java```


2. Run the main class:

```java com.omnihome.main.Main```


---

## Simulation Output

### Event System Test
- Motion detected
- Lights turn on
- Alarm sends silent notification
- Strategy switched at runtime
- Alarm triggers loud siren

### Remote Control Test
- Button 0 → Turns on lights
- Button 1 → Arms alarm
- Undo → Disarms alarm

---

## Design Principles Applied

- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Dependency Inversion Principle (DIP)

---

## Key Highlights

- Fully decoupled architecture
- Runtime behavior modification without conditionals
- Command-based undo system
- Clean separation of concerns across patterns

---

## Author Notes

This implementation demonstrates how multiple behavioral patterns
can be composed to build a scalable and maintainable system.

Commit history reflects incremental architectural development.