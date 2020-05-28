public class Main {
 
    public static void main(String[] args) {
        Box box = new Box(20);
        box.add(new Book(Nghia, My Book, 5.0));
        box.add(new CD(Jessica, Heartless, 2013));
        Box bigBox = new Box(50);
        bigBox.add(box);
        bigBox.add(new Book(Oracle, Java, 10.0));
        System.out.println(bigBox);
    }
 
}
