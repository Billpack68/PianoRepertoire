package main.java.repertoire;

import java.util.Objects;

public class PianoPiece {
  private String name;
  private Composer composer;
  private Arranger arranger;
  private Book book;
  private Genre genre;

  public PianoPiece(String name, Composer composer, Arranger arranger,
                    Book book, Genre genre) {
    this.name=name;
    this.composer = composer;
    this.arranger = arranger;
    this.book = book;
    this.genre = genre;
  }

  @Override
  public String toString() {
    return "Name = '" + name + '\'' +
            ", author = " + composer.getName() +
            ", arranger = " + arranger.getName() +
            ", book = " + book.getName() +
            ", genre = " + genre.getName();
  }

  public String getName() {return name;}

  public Composer getAuthor() {return composer;}

  public Arranger getArranger() {return arranger;}

  public Book getBook() {return book;}

  public Genre getGenre() {return genre;}

  public void setName(String newName) {name = newName;}

  public void setAuthor(Composer newComposer) {composer = newComposer;}

  public void setArranger(Arranger newArranger) {arranger = newArranger;}

  public void setBook(Book newBook) {book = newBook;}

  public void setGenre(Genre newGenre) {genre = newGenre;}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PianoPiece that=(PianoPiece) o;
    return Objects.equals(name, that.name) && Objects.equals(composer, that.composer)
            && Objects.equals(arranger, that.arranger) && Objects.equals(book, that.book)
            && Objects.equals(genre, that.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, composer, arranger, book, genre);
  }
}
