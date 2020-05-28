import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Nghia
 */
public class Warehouse {
    private Map<String, Integer> wareStock = new HashMap<>();
    private Map<String, Integer> warePrice = new HashMap<>();
    
    public void addProduct(String product, int price, int stock) {
        wareStock.put(product,stock);
        warePrice.put(product,price);
    }
    
    public int price(String product) {
        if (warePrice.containsKey(product)) {
            return warePrice.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (wareStock.containsKey(product)) {
            return wareStock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (wareStock.containsKey(product) && wareStock.get(product)>0) {
            wareStock.put(product, wareStock.get(product)-1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return wareStock.keySet();
    }
}
