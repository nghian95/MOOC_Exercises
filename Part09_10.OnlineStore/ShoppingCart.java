import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Nghia
 */
public class ShoppingCart {
    private final List<Item> cart = new ArrayList<>();
    
    public void add(String product, int price) {
        if (cart.contains(new Item(product, 1, price))) {
            for (int i=0; i<cart.size(); i++) {
                if (cart.get(i).getProduct().equals(product)){
                    cart.get(i).increaseQuantity();
                }
            }
        } else {
            cart.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total=0;
        for (Item i : cart) {
            total+=i.price();
        }
        return total;
    }
    
    public void print() {
        for (Item i : cart) {
            System.out.println(i);
        }
    }
 
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
            return false;
        }
        return true;
    }
    
    
}
