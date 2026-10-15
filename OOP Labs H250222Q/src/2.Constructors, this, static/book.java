public class book {
    private static int count = 0;

    private final int id;
    private String title;
    private String author;
    private double price;

    static {
        System.out.println("Book class loaded");
    }

    {
        count++;
        id = count;
    }

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public book(String title, String author) {
        this(title, author, 0.0);
    }

    public book() {
        this("Untitled", "Unknown");
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.printf("#%d %s by %s ($%.2f)%n", id, title, author, price);
    }

    public static void main(String[] args) {
        book b1 = new book("Clean Code", "Robert Martin", 39.99);
        book b2 = new book("Effective Java", "Joshua Bloch");
        book b3 = new book();

        b1.display();
        b2.display();
        b3.display();

        System.out.println("Total books created: " + book.getCount());
    }
}
