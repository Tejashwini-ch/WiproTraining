package app;

import controller.DeviceController;
import devices.SmartLight;
import devices.SmartFan;
import devices.SmartAC;
import devices.SmartTV;
import devices.Adjustable;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DeviceController controller = new DeviceController();

        SmartLight light = new SmartLight();
        SmartFan fan = new SmartFan();
        SmartAC ac = new SmartAC();
        SmartTV tv = new SmartTV();

        controller.addDevice(light);
        controller.addDevice(fan);
        controller.addDevice(ac);
        controller.addDevice(tv);

        int choice;
        do {
            System.out.println("\n-----------SMART HOME CONTROLLER MENU------------");
            System.out.println("1. Turn ON Smart Light");
            System.out.println("2. Turn ON Smart Fan");
            System.out.println("3. Turn ON Smart AC");
            System.out.println("4. Turn ON Smart TV");
            System.out.println("5. Turn OFF all devices");
            System.out.println("6. Adjust all adjustable devices");
            System.out.println("7. View device status");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    light.turnOn();
                    ((Adjustable) light).increaseSetting();
                    break;

                case 2:
                    fan.turnOn();
                    System.out.print("Enter desired fan speed (1–5): ");
                    int desiredSpeed = sc.nextInt();

                    if (desiredSpeed < 1 || desiredSpeed > 5) {
                        System.out.println("Invalid speed. Please enter between 1 and 5.");
                    } else {
                        while (fan.getSpeed() < desiredSpeed) {
                            fan.increaseSetting();
                        }
                        while (fan.getSpeed() > desiredSpeed) {
                            fan.decreaseSetting();
                        }
                        System.out.println("Fan speed adjusted to: " + fan.getSpeed());
                    }
                    break;

                case 3:
                    ac.turnOn();
                    System.out.print("Enter desired AC temperature: ");
                    int temp = sc.nextInt();

                    while (ac.getTemperature() < temp) {
                        ac.increaseSetting();
                    }
                    while (ac.getTemperature() > temp) {
                        ac.decreaseSetting();
                    }
                    System.out.println("AC temperature adjusted to: " + ac.getTemperature());
                    break;

                case 4:
                    tv.turnOn();
                    ((Adjustable) tv).increaseSetting();
                    break;

                case 5:
                    controller.turnAllOff();
                    break;

                case 6:
                    controller.adjustAllDevices();
                    break;

                case 7:
                    System.out.println("\n--- DEVICE STATUS ---");
                    System.out.println("Smart Light: " + (light.isDeviceOn() ? "ON" : "OFF"));
                    System.out.println("Smart Fan: " + (fan.isDeviceOn() ? "ON" : "OFF"));
                    System.out.println("Smart AC: " + (ac.isDeviceOn() ? "ON" : "OFF"));
                    System.out.println("Smart TV: " + (tv.isDeviceOn() ? "ON" : "OFF"));
                    break;

                case 8:
                    System.out.println("Exiting Smart Home Controller.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
