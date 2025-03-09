package task2;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Workstation extends Laptop{
    private String WorkstationModel;

    public Workstation() {
    }

    public Workstation(String gpu, int ram, String motherboard, String powerUnit, String keyboard, String monitor, String workstationModel) {
        super(gpu, ram, motherboard, powerUnit, keyboard, monitor);
        WorkstationModel = workstationModel;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "WorkstationModel='" + WorkstationModel + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", powerUnit='" + powerUnit + '\'' +
                "} " + super.toString();
    }
}
