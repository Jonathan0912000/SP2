import java.util.ArrayList;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        //TEST of code

        Author testAuthor = new Author("Test Forfatter");
        //Title testBog = new PrintedBook("tegneserie", "TE", 140, 72);
        Title testLydbog = new AudioBook("Lydbog", "SKØN", 10, 400);
        //testAuthor.addTitle(testBog);
        testAuthor.addTitle(testLydbog);
        //System.out.println(testAuthor.getName() + ": " + testAuthor.calculateTotalPay() + " kr");
        System.out.println(testAuthor.getName() + ": " + testAuthor.calculateTotalPay() + " kr");


        // example of code using an arraylist for authors.

        Author author1 = new Author("Bob");

        Title PrintedBook1 = new PrintedBook("Min kamp", "SKØN", 100, 300);
        Title PrintedBook2 = new PrintedBook("Den rigtige verden", "FAG", 15000, 20);
        Title AudioBook1 = new AudioBook("Klovn", "LYRIK", 250, 60);

        author1.addTitle(PrintedBook1);
        author1.addTitle(PrintedBook2);
        author1.addTitle(AudioBook1);

        //prints out the list of authors and the payment they need to recieve.

        ArrayList<Author> AuthorList = new ArrayList<>();
        AuthorList.add(author1);
        System.out.print(AuthorList);
    }
}