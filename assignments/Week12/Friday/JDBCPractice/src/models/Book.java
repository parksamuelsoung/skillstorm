package models;

import java.util.Objects;

public class Book {

    private String ISBN;
    private String name;
    private String genre;

    public Book(String iSBN, String name, String genre) {
        ISBN = iSBN;
        this.name = name;
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, name, genre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return this.ISBN.equals(other.ISBN) &&
            this.name.equals(other.name) &&
            this.genre.equals(other.genre) ;
    }

    @Override
    public String toString() {
        return "\nBook [ISBN=" + ISBN + ", name=" + name + ", genre=" + genre + "]";
    }

    

    
    
}
