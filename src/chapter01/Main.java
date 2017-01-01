package chapter01;

/**
 * Created by sngwon on 2017-01-01.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator iter = bookShelf.iterator();

        while (iter.hasNext()) {
            Book book = (Book) iter.next();
            System.out.println(book.getName());
        }
    }
}
