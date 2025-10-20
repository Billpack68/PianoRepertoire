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
      System.out.println("--------------------------------");
      System.out.println("---What would you like to do?---");
      System.out.println("--------------------------------");
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
              if ((composers.isEmpty() && arrangers.isEmpty()) || genres.isEmpty()) {
                System.out.println("I need at least 1 composer/arranger and genre in my database.");
                break;
              }
              System.out.println("Enter song name:");
              String newSongName = scanner.nextLine();

              System.out.println("Enter composer (leave blank for empty):");
              String newComposerName = scanner.nextLine();
              Composer newComposerObject = new Composer(null);
              if (!Objects.equals(newComposerName, "")) {
                newComposerObject.setName(newComposerName);
                if (!composers.contains(newComposerObject)) {
                  System.out.println("I don't know who that is yet!");
                  break;
                }
              }

              System.out.println("Enter arranger (leave blank for empty):");
              String newArrangerName = scanner.nextLine();
              Arranger newArrangerObject = new Arranger(null);
              if (!Objects.equals(newArrangerName, "")) {
                newArrangerObject.setName(newArrangerName);
                if (!arrangers.contains(newArrangerObject)) {
                  System.out.println("I don't know who that is yet!");
                  break;
                }
              }

              if (Objects.equals(newComposerName, "") && Objects.equals(newArrangerName, "")) {
                System.out.println("I need either a composer or arranger. Let's try this again!");
                break;
              }

              System.out.println("Enter book (leave blank for empty):");
              String newBookName = scanner.nextLine();
              Book newBookObject = new Book(null);
              if (!Objects.equals(newBookName, "")) {
                newBookObject .setName(newBookName);
                if (!books.contains(newBookObject)) {
                  System.out.println("I don't know that book yet!");
                }
              }

              System.out.println("Enter genre");
              String newGenreName = scanner.nextLine();
              if (Objects.equals(newGenreName, "")) {
                System.out.println("I need a genre for this song!");
                break;
              }
              Genre newGenreObject = new Genre(newGenreName);
              if (!genres.contains(newGenreObject)) {
                System.out.println("I don't know that genre yet!");
                break;
              }

              PianoPiece newPianoPiece = new PianoPiece(newSongName, newComposerObject, newArrangerObject,
                      newBookObject, newGenreObject);
              pianoPieces.add(newPianoPiece);
              System.out.println("Added that to the database!");
              break;

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
          if (!pianoPieces.isEmpty()) {
            System.out.println("Songs:");
            for (PianoPiece piece : pianoPieces) {
              System.out.println(piece.toString());
            }
          }
          if (!composers.isEmpty()) {
            System.out.println("Composers:");
            for (Composer composer : composers) {
              System.out.println(composer.toString());
            }
          }
          if (!arrangers.isEmpty()) {
            System.out.println("Arrangers:");
            for (Arranger arranger : arrangers) {
              System.out.println(arranger.toString());
            }
          }
          if (!books.isEmpty()) {
            System.out.println("Books:");
            for (Book book : books) {
              System.out.println(book.toString());
            }
          }
          if (!genres.isEmpty()) {
            System.out.println("Genres:");
            for (Genre genre : genres) {
              System.out.println(genre.toString());
            }
          }

          break;

        case "3":
          running = false;
          System.out.println("Goodbye!");
          break;
      }
    }
  }
}
