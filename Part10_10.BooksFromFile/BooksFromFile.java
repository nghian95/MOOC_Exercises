
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    
    public static List<Book> readBooks(String file) {
        List<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> list.add(row));
        } catch (IOException ex) {
            Logger.getLogger(BooksFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.stream()
                .map(s -> s.split(","))
                .filter(a -> a.length >= 4)
                .map(a -> new Book(a[0],Integer.valueOf(a[1]),Integer.valueOf(a[2]),a[3]))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}

