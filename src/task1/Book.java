package task1;

import lombok.Data;

@Data
public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Print Book" + ' ' + title);

    }
}
