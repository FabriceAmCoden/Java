package carold;

public class RemoteControl {
    private Battery battery1;
    private Battery battery2;

    public RemoteControl(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public double getStatus() {
        int numBatteries = 2;
        double totalCharge = battery1.getChargeLevel() + battery2.getChargeLevel();
        return totalCharge / numBatteries;
    }

    public void turnOn() {
        battery1.drain(0.05);
        battery2.drain(0.05);
        System.out.println("Consumer connected.");
    }

    public void turnOff() {
        System.out.println("No consumer connected.");
    }
}

