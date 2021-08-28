package demo;

import lombok.Data;

import java.util.List;

@Data
public class Basket {
    private int id;
    private String detail;
    private int amount;
    private int discount;
    private int netPrice;
    private List<Book> books;
    public Basket(Customer customer) {
    }

    public void addBooks(List<Book> books) {
    }
}
