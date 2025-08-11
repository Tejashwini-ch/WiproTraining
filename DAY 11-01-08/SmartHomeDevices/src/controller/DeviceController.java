package controller;

import devices.SmartDevice;
import devices.Adjustable;

import java.util.ArrayList;
import java.util.List;

public class DeviceController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void adjustAllDevices() {
        for (SmartDevice device : devices) {
            if (device instanceof Adjustable) {
                ((Adjustable) device).increaseSetting();
                ((Adjustable) device).decreaseSetting();
            }
        }
    }
}
