package oo;

public class CarSWP {
    Öffentliche Klasse Auto {
        privater Motormotor ;
        private String serialNumber;
        private  String-Farbe;
        Privat int fueldVerbrauch;
        Privater INT Tank;

        private int speed;

        private int honkCounter;

        öffentliches Auto(
                Motormotor,
                Zeichenfolgen-Seriennummer,
                Farbe der Saite,
        int fueldVerbrauch,
        int Tank,
        int Geschwindigkeit) {
            Dies.  Motor = Motor;
            Dies. serialNumber = serialNumber;
            Dies.  Farbe = Farbe;
            Dies. fueldConsumption = fueldConsumption;
            Dies. setTank(Tank));
            Dies.  Geschwindigkeit = Geschwindigkeit;
        }

        Öffentliches leeres Laufwerk() {
            Dies. Geschwindigkeit = 100;
            Dies. tank = dies. Tank - getanktVerbrauch;
            System. aus. println (Geschwindigkeit + "km/h");
            System. aus. println("Ich fahre");

        }

        public void doBreak() {
            Dies. Geschwindigkeit = 0;
            System. aus. println (Geschwindigkeit + "km/h");
            System. aus. println("Ich breche");
        }

        public void turboBoost() {
            int valueOfFuel = tank - fueldConsumption;
            int valueOfTenProzent = tank / 100 * 10;
            if (valueOfFuel > valueOfTenProzent) {
                System. aus. println("SupperBoostMode");
            } oder {
                System. aus. println("Nicht genug Treibstoff für Superboost");

            }

        }

        Public Void Hupen() {
            Dies. honkCounter=1;
            System. aus. println("Das Auto hat "+this. getEngine(). getHorsePower() + " Pferdestärken" + " Es hupt " + this. honkCounter + " *" + " Tuuut");
            Dies. honkCounter++;
        }

        public void getRemainingRange() {
            int residualTank = tank - fueldConsumption;
            int range = residualTank * 5;
            System. aus. println("Das Auto kann noch " + range + " km fahren.");
        }

        public void setSerialNumber(String serialNumber) {
            Dies. serialNumber = serialNumber;
        }

        public void setColour(String-Farbe) {
            Dies.  Farbe = Farbe;
        }

        public void setFueldConsumption(int fueldConsumption) {
            Dies. fueldConsumption = fueldConsumption;
        }

        public void setTank(int fuelAmount) {
            Dies. tank = fuelAmount;
        }

        public void setSpeed(int speed) {
            Dies.  Geschwindigkeit = Geschwindigkeit;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public String getColour() {
            Farbe zurückgeben ;
        }

        public int getFueldConsumption() {
            zurück getanktVerbrauch;
        }

        public Engine getEngine() {
            Rücklaufmotor ;
        }


        public void setEngine (Engine engine)) {
            Dies.  Motor = Motor;
        }

        public int getTank() {
            if (Tank > 100) {
                Tank = 100;
            } oder {

            }
            Rücklaufbehälter ;
        }

        public int getSpeed() {
            Rücklaufgeschwindigkeit ;
        }

    }
}
