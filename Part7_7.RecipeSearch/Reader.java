/**
 *
 * @author Nghia
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Reader {
    private Scanner scanner;
    private UserInterface ui;
    private ArrayList<Recipe> recipes;
    private String file;
    
    public Reader() {
        
    }
    
    public void readRecipe(){
        int count = 0;
        String name = ;
        int time = 0;
        ArrayList<String> ingredientz = new ArrayList<>();
        recipes = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                    recipes.add(new Recipe(name,time,ingredientz));
                    count=0;
                    ingredientz = new ArrayList<>();
                } else if (count==0) {
                    name = str;
                    count++;
                } else if (count==1) {
                    time = Integer.valueOf(str);
                    count++;
                } else {
                    ingredientz.add(str);
                }
            }
        } catch (Exception e) {
            System.out.println(Error:  + e.getMessage());
        }
    }
    
    public ArrayList<Recipe> getRecipes(){
        return recipes;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    
    public void findName(String word){
        readRecipe();
        System.out.println(nRecipes: );
        for (Recipe rec : recipes) {
            if (rec.getName().contains(word)) {
                System.out.println(rec);
            }
        }
        System.out.println();
    }
    
    public void findMaxTime(int max) {
        readRecipe();
        System.out.println(nRecipes:);
        for (Recipe rec : recipes) {
            if (rec.getTime()<=max) {
                System.out.println(rec);
            }
        }
    }
    
    public void findIngredient(String ing){
        readRecipe();
        System.out.println(nRecipes:);
        for (Recipe rec : recipes) {
            if ((rec.getIngredients()).contains(ing)) {
                System.out.println(rec);
            }
        }
    }
}
