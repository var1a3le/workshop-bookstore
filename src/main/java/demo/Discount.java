package demo;

import lombok.Data;

@Data
public class Discount {
    private int id;
    private int amount;
    private int percentage;

    public int calculate(Basket basket) {
        //TODO cal process
        return 0;
    }
}
