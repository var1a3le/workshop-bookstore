package demo;

import lombok.Data;

@Data
public class Item {
    private int quantity;
    private Basket basket;
}
