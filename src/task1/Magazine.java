package task1;

import lombok.Data;

@Data
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print Magazine" + name);

    }
}
