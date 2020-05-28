/**
 *
 * @author Nghia
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
 
public class UserInterface {
    private Scanner scanner;
    private Reader reader;
    private String file;
    
    public UserInterface(Scanner scanner, Reader reader) {
        this.scanner = scanner;
        this.reader = reader;
    }
    
    public void start() {
        System.out.print(File to read: );
        reader.setFile(scanner.nextLine());
        System.out.println(nCommandsnlist - lists the recipesnstop - stops the programnfind name - searches recipe by name);
        System.out.println(find cooking time - searches recipes by cooking timenfind ingredient - searches recipes by ingredientn);
        while(true) {
            System.out.print(Enter command: );
            String command = scanner.nextLine();
            if (command.equals(stop)) {
                return;
            } else if (command.equals(list)) {
                System.out.println(nRecipes:);
                reader.readRecipe();
                for (int i = 0; i<reader.getRecipes().size(); i++) {
                    System.out.println(reader.getRecipes().get(i).getName() + , cooking time:  + reader.getRecipes().get(i).getTime());
                    System.out.println(ingredients:  + reader.getRecipes().get(i).getIngredients());
                }
                System.out.println();
            } else if (command.equals(find name)) {
                System.out.print(Searched word: );
                String word = scanner.nextLine();
                reader.findName(word);
            } else if (command.equals(find cooking time)) {
                System.out.print(Max cooking time: );
                int max = Integer.valueOf(scanner.nextLine());
                reader.findMaxTime(max);
            } else if (command.equals(find ingredient)) {
                System.out.print(Ingredient: );
                String ingredient = scanner.nextLine();
                reader.findIngredient(ingredient);
            }
        }
    }
    
    public String getFile(){
        System.out.println(file);
        return file;
    }
}
