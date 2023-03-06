package carold;


import oo.Car;

public class rueckspiegelureifen {
    public Class Auto {
        private int anzahlRueckspiegel;
        private int anzahlReifen;

        public Auto(int anzahlRueckspiegel, int anzahlReifen) {
            this.anzahlRueckspiegel = anzahlRueckspiegel;
            this.anzahlReifen = anzahlReifen;
        }

        public int getAnzahlRueckspiegel() {
            return anzahlRueckspiegel;
        }

        public int getAnzahlReifen() {
            return anzahlReifen;
        }

        public void fahre() {
            System.out.println("Das Auto fährt...");
        }

        public void bremse() {
            System.out.println("Das Auto bremst...");
        }

        public static void main(String[] args) {
            Auto meinAuto = Auto car(2,4);
            System.out.println("Anzahl Rückspiegel: " + meinAuto.getAnzahlRueckspiegel());
            System.out.println("Anzahl Reifen: " + meinAuto.getAnzahlReifen());
            meinAuto.fahre();
            meinAuto.bremse();
        }
    }


}
