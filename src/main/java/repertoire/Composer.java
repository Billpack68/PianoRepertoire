package main.java.repertoire;

import java.util.Objects;

public class Composer {
  private String name;

  public Composer(String name) {
    this.name=name;
  }

  public String getName() {return name;}

  public void setName(String newName) {name = newName;}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Composer composer=(Composer) o;
    return Objects.equals(name, composer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
