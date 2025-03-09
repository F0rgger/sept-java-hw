package task2;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public  class Ultrabook extends Laptop{
    private String model;
    private String brand;

    public Ultrabook() {
    }

    public Ultrabook(String gpu, int ram, String motherboard, String powerUnit, String keyboard, String monitor, String brand, String model) {
        super(gpu, ram, motherboard, powerUnit, keyboard, monitor);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", powerUnit='" + powerUnit + '\'' +
                "} " + super.toString();
    }
}
