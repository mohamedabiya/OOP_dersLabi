public class LibraryExample {
    public static void main(String[] args) {
        Book book1 = new Book("Book One", 150);
        Book book2 = new Book("Book Two", 250);

        Library library = new Library("City Library", 4);
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Library Name: " + library.getName());
        library.displayBooks();

        try {
            library.addBook(new Book("Book Three", 300));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // this is to demonstrate a general exception catch
        // it did not execute the addBook line above because of the previous exception
        // it will not IllegalArgumentException but will throw a different exception
        // so we can see how the general exception catch works
        try {
            int a = 10 / 0;
            library.addBook(new Book("Book Three", 300));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        library.displayBooks();
    }
}
