 
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
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice*qty;
    }
    
    public void increaseQuantity() {
        qty++;
    }
    
    public String getProduct(){
        return product;
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.product);
        hash = 71 * hash + this.qty;
        hash = 71 * hash + this.unitPrice;
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
        final Item other = (Item) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
            return false;
        }
        return true;
    }
    
    public String toString() {
        return product + :  + qty;
    }
}
