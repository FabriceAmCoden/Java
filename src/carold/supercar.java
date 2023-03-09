package carold;

public class supercar extends carNew {
    private String trailer;
    public supercar(String serialNumber, String colour, int fueldConsumption, int tank, int speed, String trailer) {
        super(serialNumber, colour, fueldConsumption, tank, speed);
        this.trailer = trailer;

    }
    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
