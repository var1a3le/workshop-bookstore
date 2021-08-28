package demo;

import lombok.Data;

@Data
public class Basket {
    private int id;
    private String detail;
    private int amount;
    private int discount;
    private int netPrice;
}
