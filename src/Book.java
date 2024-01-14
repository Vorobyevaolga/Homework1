import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearBook;

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }


    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.author = nameAuthor;
        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return "Название:"+ nameBook+". Автор : "+ author + ". Год выпуска: "+yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearBook);
    }
}
