import com.gabr.corejava.Book;
import com.gabr.corejava.BookStore;

public class testBook {

    public static void main(String[] args) {

        var books = new Book[3];

        books[0] = new Book("Fight Club", "Chuck Palahniuk", 110);
        books[1] = new Book("Dune", "Frank Herbert", 99);
        books[2] = new Book("Shinning", "Stephen King", 150);

        for (Book book : books)
            System.out.printf("Name: %s, Author: %s, Cost: %f\n\n",
                    book.getTitle(), book.getAuthor(), book.getCost());

        BookStore bookStore = new BookStore(books);
        float totalCost = bookStore.getTotalCost();

        System.out.printf("Total cost: %f", totalCost);

    }

}
