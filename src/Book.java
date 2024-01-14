public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearBook;

    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getyearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
