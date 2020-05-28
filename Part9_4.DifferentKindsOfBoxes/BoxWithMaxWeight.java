/**
 *
 * @author Nghia
 */
import java.util.ArrayList;
 
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
 
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int weight = 0;
            for (Item i : items) {
                weight+=i.getWeight();
            }
        }
        if (weight+item.getWeight()<=capacity) {
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
