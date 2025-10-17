package main.java.repertoire;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<PianoPiece> pianoPieces = new HashSet<>();
    Set<Composer> composers = new HashSet<>();
    Set<Arranger> arrangers = new HashSet<>();
    Set<Book> books = new HashSet<>();
    Set<Genre> genres = new HashSet<>();

    System.out.println("Welcome to the piano repertoire tracker!");
    boolean running = true;

    while (running) {
      System.out.println("What would you like to do?");
      System.out.println("1. Add something to the database");
      System.out.println("2. View everything in the database");
      System.out.println("3. Exit");
      String choice = scanner.nextLine();

      switch (choice) {
        case "1":
          System.out.println("What would you like to add?");
          System.out.println("1. Piece");
          System.out.println("2. Composer");
          System.out.println("3. Arranger");
          System.out.println("4. Book");
          System.out.println("5. Genre");
          System.out.println("6. Cancel");
          String nextChoice = scanner.nextLine();

          switch (nextChoice) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
              System.out.println("Gotcha. Sending you back now!");
              break;
          }
          break;

        case "2":
        case "3":
          running = false;
          System.out.println("Goodbye!");
          break;
      }
    }
  }
}
