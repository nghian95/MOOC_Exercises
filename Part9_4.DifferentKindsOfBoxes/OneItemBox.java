import java.util.ArrayList;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Nghia
 */
public class OneItemBox extends Box{
    private int capacity = 1;
    private ArrayList<Item> items;
    
    public OneItemBox(){
        items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (items.isEmpty()) {
            items.add(item);
        }
    }
 
    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
    
}
