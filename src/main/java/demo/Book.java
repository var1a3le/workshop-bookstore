package demo;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String name;
    private int price;
    private int stock;

    public Book() {
    }
}
