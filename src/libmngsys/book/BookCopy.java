package libmngsys.book;

public class BookCopy {

    // composition over inheritance as BookDetails is just a data class, i.e. some data (along with getters/setters if any) and no particular behavior, and inheritance is used only if we want to inherit some behaviors
    private final BookDetails bookDetails;
    private final int id;


    public BookCopy(BookDetails bookDetails, int id) {
        this.bookDetails = bookDetails;
        this.id = id;
    }
}
