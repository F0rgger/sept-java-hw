package task2;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Laptop extends  PC{
    public String keyboard;;
    public String monitor;

    public Laptop() {
    }

    public Laptop(String gpu, int ram, String motherboard, String powerUnit, String keyboard, String monitor) {
        super(gpu, ram, motherboard, powerUnit);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", powerUnit='" + powerUnit + '\'' +
                "} " + super.toString();
    }
}
