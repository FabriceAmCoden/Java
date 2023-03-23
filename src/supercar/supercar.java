package supercar;

import carold.carNew;

public class supercar extends carNew {
    private String wing;
    public supercar(String serialNumber, String colour, int fueldConsumption, int tank, int speed, String wing) {
        super(serialNumber, colour, fueldConsumption, tank, speed);
        this.wing = wing;

    }

    public supercar(String mercedes, String blue, int fueldConsumption, int tank, int speed) {
        super();
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
