package task2;

import lombok.Data;

@Data
public class Trumpet implements Instrument{
    public double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + diameter + " см.");

    }
}
