package main.java.repertoire;

import java.util.Objects;

public class Book {
  private String name;

  public Book(String name) {
    this.name=name;
  }

  public String getName() {return name;}

  public void setName(String newName) {name = newName;}

  @Override
  public String toString() {return name;}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book=(Book) o;
    return Objects.equals(name, book.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
