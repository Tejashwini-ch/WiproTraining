package devices;

public class SmartTV implements SmartDevice, Adjustable {
    private boolean isOn = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV is OFF");
    }

    @Override
    public void increaseSetting() {
        volume++;
        System.out.println("Volume increased to: " + volume);
    }

    @Override
    public void decreaseSetting() {
        volume--;
        System.out.println("Volume decreased to: " + volume);
    }

    @Override
    public boolean isDeviceOn() {
        return isOn;
    }
}
