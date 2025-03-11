package task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(6),
                new Drum(40),
                new Trumpet(12)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}