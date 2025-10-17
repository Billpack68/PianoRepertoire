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
              // TODO: Check if I have a composer, arranger, book, and genre in my database already
              // TODO: If I have at least one of each, get the name of a song, then select the rest
              // TODO: Add the new PianoPiece to the database
            case "2":
              System.out.println("Enter a name for a composer:");
              String composerName = scanner.nextLine();
              Composer newComposer = new Composer(composerName);
              if (composers.contains(newComposer)) {
                System.out.println("That composer is already here, silly!");
              } else {
                composers.add(newComposer);
                System.out.println("Added " + composerName + " to the list!");
              }
              break;

            case "3":
              System.out.println("Enter a name for an arranger:");
              String arrangerName = scanner.nextLine();
              Arranger newArranger = new Arranger(arrangerName);
              if (arrangers.contains(newArranger)) {
                System.out.println("That arranger is already here, silly!");
              } else {
                arrangers.add(newArranger);
                System.out.println("Added " + arrangerName + " to the list!");
              }
              break;

            case "4":
              System.out.println("Enter a name for a book:");
              String bookName = scanner.nextLine();
              Book newBook = new Book(bookName);
              if (books.contains(newBook)) {
                System.out.println("That book is already here, silly!");
              } else {
                books.add(newBook);
                System.out.println("Added " + bookName + " to the list!");
              }
              break;

            case "5":
              System.out.println("Enter a name for a genre:");
              String genreName = scanner.nextLine();
              Genre newGenre = new Genre(genreName);
              if (genres.contains(newGenre)) {
                System.out.println("That genre is already here, silly!");
              } else {
                genres.add(newGenre);
                System.out.println("Added " + genreName + " to the list!");
              }
              break;

            case "6":
              System.out.println("Gotcha. Sending you back now!");
              break;
          }
          break;

        case "2":
          // TODO: For seeing what's in the database (or soon to be database)
        case "3":
          running = false;
          System.out.println("Goodbye!");
          break;
      }
    }
  }
}
