package main.java.repertoire;

import java.util.Objects;

public class Arranger {
  private String name;

  public Arranger(String name) {
    this.name=name;
  }

  public String getName() {return name;}

  public void setName(String newName) {name = newName;}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Arranger arranger=(Arranger) o;
    return Objects.equals(name, arranger.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
