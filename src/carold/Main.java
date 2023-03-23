package carold;

import supercar.supercar;

public class Main {
    public static void main (String[]args){
      carNew c1 = new carNew("A1234","red",69,70,340);

      c1.turboBoost();
      c1.doBreak();
      c1.drive();
      c1.getRemainingRange();
      c1.getTank();

    }
    supercar t1 = new supercar ("mercedes", "blue", 80, 90, 420);




}



