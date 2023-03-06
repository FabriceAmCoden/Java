package carold;

public class Battery {
    private double chargeLevel;

    public Battery(double chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void drain(double amount) {
        chargeLevel -= amount;
    }
}
