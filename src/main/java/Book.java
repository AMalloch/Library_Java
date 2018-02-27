public class Book {

    private BookType genre;

    public Book(BookType genre){
        this.genre = genre;
    }

    public String getValueFromGenre(){
        return this.genre.getValue();
    }
}
