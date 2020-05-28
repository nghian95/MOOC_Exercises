import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        UserInterface ui = new UserInterface(scanner,reader);
        
        ui.start();
    }
 
}
