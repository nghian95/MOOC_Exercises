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
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> packables = new ArrayList<>();
    
    public Box (double maximumCapacity) {
        capacity = maximumCapacity;
    }
 
    public void add(Packable packable) {
        if (weight()+packable.weight()<=capacity) {
            packables.add(packable);
        }
    }
    
    @Override
    public double weight() {
        double total = 0;
        for (Packable p : packables) {
            total+=p.weight();
        }
        return total;
    }
    
    public String toString() {
        return Box:  + packables.size() +  items, total weight  + weight() +  kg;
    }
}
