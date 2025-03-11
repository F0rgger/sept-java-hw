package task2;

import lombok.Data;

@Data
public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int strings) {
        this.numberOfStrings = strings;
    }

    @Override
    public void play() {
        System.out.println("Грає гітара з " + numberOfStrings + " струнами.");

    }
}
