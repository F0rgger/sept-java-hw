package task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class PC{
    private String gpu;
    private int ram;
    public String motherboard;
    public String powerUnit;

    public PC() {
    }

    public PC(String gpu, String motherboard, String powerUnit, int ram) {
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.powerUnit = powerUnit;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", motherboard='" + motherboard + '\'' +
                ", powerUnit='" + powerUnit + '\'' +
                '}';
    }
}
