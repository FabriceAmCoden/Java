public class carNew {
    private String serialNumber;
    private String colour;
    private int fueldConsumption;
    private int tank;

    private int speed;



    public void carNew(String serialnumber,
                        String colour,
                        int fueldConsumption,
                        int tank,
                        int speed) {
        this.serialNumber = serialNumber;
        String carNewr;
        this.colour = colour;
        this.fueldConsumption = fueldConsumption;
        this.setTank(tank);
        this.speed = speed;
    }

    public void drive() {
        this.speed = 100;
        this.tank = this.tank - fueldConsumption;
        System.out.println(speed + "km/h");
        System.out.println("I am driving");

    }
ä
    public void doBreak() {
        this.speed = 0;
        System.out.println(speed + "km/h");
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        int valueOfFuel = tank - fueldConsumption;
        int valueOfTenProzent = tank / 100 * 10;
        if (valueOfFuel > valueOfTenProzent) {
            System.out.println("Boost");
        } else {
            System.out.println("not enough Boost");

        }

    }

    public void honk() {
        int amountOfRepetitions = 2;
        System.out.println(amountOfRepetitions + " * " + " Hoop");
    }

    public void getRemainingRange(){
        int residualTank = tank - fueldConsumption;
        int range = residualTank * 5;
        System.out.println("Das Auto kann " + range + " km fahren.");
    }



    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFueldConsumption(int fueldConsumption) {
        this.fueldConsumption = fueldConsumption;
    }

    public void setTank(int fuelAmount) {
        this.tank = fuelAmount;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColour() {
        return colour;
    }

    public int getTank() {
        if (tank > 150) {
            tank = 150;
        }
        return tank;
    }

}

