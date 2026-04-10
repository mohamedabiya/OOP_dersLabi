public class Book {
    // name has final keyword, so we cannot change it after initialization
    private final String name;
    // pages does not have final keyword, because we can change it using setPages method
    private int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public String toString() {
        return "Book{name='" + name + "', pages=" + pages + "}";
    }
    public String getName() {
        return name;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
