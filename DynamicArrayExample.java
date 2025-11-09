public class DynamicArrayExample {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Book One", 150);
        books[1] = new Book("Book Two", 250);
        books[2] = new Book("Book Three", 300);

        // if we want to new add a book, we need to create a new array with a larger size
        Book[] tempBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            tempBooks[i] = books[i];
        }
        tempBooks[books.length] = new Book("Book Four", 200);

        books = tempBooks; // reassign the reference to the new array

        // in this code for example we have library with 3 books
        // then we want to add a new book
        // so we create a new array with size 4
        // copy the old books to the new array
        // add the new book to the new array
        // and finally reassign the reference to the new array
        for (Book book : books) {
            System.out.println(book);
        }
    }
}