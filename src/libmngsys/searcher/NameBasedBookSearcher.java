package libmngsys.searcher;

import libmngsys.book.BookCopy;
import libmngsys.dataaccessor.DBAccessor;
import libmngsys.dataaccessor.Results;
import libmngsys.dataaccessor.ResultsConverter;

import java.util.List;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName;
    private final DBAccessor dbAccessor;

    public NameBasedBookSearcher(String bookName, DBAccessor dbAccessor) {
        this.bookName = bookName;
        this.dbAccessor = dbAccessor;
    }

    @Override
    public List<BookCopy> search() {
        Results results = dbAccessor.getBooksWithName(bookName);
        return ResultsConverter.convertToBookCopies(results);
    }
}
