import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void checkStock(Book book){
        if (this.getBookCount() < capacity);
        this.addBook(book);
    }

    public Book removeBook(int book){
        return this.collection.remove(book);
    }
}
