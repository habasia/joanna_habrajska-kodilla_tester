public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    static Book of(String author,String title)
    {
        return new Book(author,title);
    }

    public static void main(String[] args) {
        Book book = Book.of("Milne", "Kubus Puchatek");
        System.out.println(book.author + " " + book.title);
    }
}
