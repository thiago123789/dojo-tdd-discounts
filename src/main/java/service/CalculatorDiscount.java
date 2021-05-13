package service;

import model.ShoppingCart;

public class CalculatorDiscount {
    public double calculateDiscount(ShoppingCart cart) {
        if (cart.price <= 499.99) {
            return 0;
        }else if(cart.price >= 1000.00){
            return 20;
        }else {
            return 10;
        }
    }
}