package main.java.repertoire;

public class PianoPiece {
  private String name;
  private Author author;
  private Arranger arranger;
  private Book book;
  private Genre genre;

  public PianoPiece(String name, Author author, Arranger arranger,
                    Book book, Genre genre) {
    this.name=name;
    this.author = author;
    this.arranger = arranger;
    this.book = book;
    this.genre = genre;
  }

  public String getName() {return name;}

  public Author getAuthor() {return author;}

  public Arranger getArranger() {return arranger;}

  public Book getBook() {return book;}

  public Genre getGenre() {return genre;}

  public void setName(String newName) {name = newName;}

  public void setAuthor(Author newAuthor) {author = newAuthor;}

  public void setArranger(Arranger newArranger) {arranger = newArranger;}

  public void setBook(Book newBook) {book = newBook;}

  public void setGenre(Genre newGenre) {genre = newGenre;}
}
