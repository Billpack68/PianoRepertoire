package main.java.repertoire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<PianoPiece> pianoPieces = new ArrayList<>();
    List<Author> authors = new ArrayList<>();
    List<Arranger> arrangers = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Genre> genres = new ArrayList<>();

    System.out.println("Welcome to the piano repertoire tracker!");
    boolean running = true;

    while (running) {
      System.out.println("What would you like to do?");
      System.out.println("1. Add piece");
      System.out.println("2. Add composer");
      System.out.println("3. Add arranger");
      System.out.println("4. Add book");
      System.out.println("5. Add genre");
      System.out.println("6. Exit");
    }
  }
}
