package main.java.repertoire;

import java.util.Objects;

public class Genre {
  private String name;

  public Genre(String name) {
    this.name=name;
  }

  public String getName() {return name;}

  public void setName(String newName) {name = newName;}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Genre genre=(Genre) o;
    return Objects.equals(name, genre.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
