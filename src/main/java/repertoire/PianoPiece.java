package main.java.repertoire;

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
}
