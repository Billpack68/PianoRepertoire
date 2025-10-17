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
}
