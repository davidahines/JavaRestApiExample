package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Book {

    private @Id @GeneratedValue Long id;
    private String name;
    private String author;

    Book() {}

    Book(String name, String author) {

        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        Book Book = (Book) o;
        return Objects.equals(this.id, Book.id) && Objects.equals(this.name, Book.name)
                && Objects.equals(this.author, Book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.author);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + this.id + ", name='" + this.name + '\'' + ", author='" + this.author + '\'' + '}';
    }
}