/**
 *
 * @author Nghia
 */
import java.util.ArrayList;
 
public class Recipe {
    private String name;
    private int time;
    public ArrayList<String> ingredients = new ArrayList<>();
    
    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return name + , cooking time:  + time;
    }
}
