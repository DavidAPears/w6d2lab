import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if (books.size() <capacity){
            this.books.add(book);
        }
    }

    public int bookCount() {
        return this.books.size();
    }




}
