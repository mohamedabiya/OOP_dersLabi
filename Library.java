public class Library {
    // note that we use final here to indicate
    // that the reference to the name won't change
    private final String name;
    // note that we use final here to indicate
    // that the reference to the array won't change
    private final Book[] books;
    // it is not final because it will change
    private int bookCount;

    Library(String name, int capacity) {
        this.name = name;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount >= books.length) {
            throw new IllegalArgumentException("Library is full. Cannot add more books.");
        }
        books[bookCount++] = book;
    }

    public String getName() {
        return name;
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}