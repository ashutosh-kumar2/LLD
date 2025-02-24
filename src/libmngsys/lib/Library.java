package libmngsys.lib;

import libmngsys.book.BookCopy;
import libmngsys.dataaccessor.DBAccessor;
import libmngsys.dataaccessor.Results;
import libmngsys.dataaccessor.ResultsConverter;
import libmngsys.user.Member;

import java.util.List;

// Business layer class logic
public class Library {

    private final DBAccessor dbAccessor;

    public Library(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy){
        if(bookCopy == null){
            throw new IllegalArgumentException("bookName can't be null");
        }
        dbAccessor.insertBookCopy(bookCopy);
    }

    public void deleteBookCopy(BookCopy bookCopy){
        if(bookCopy == null){
            throw new IllegalArgumentException("bookName can't be null");
        }
        // check if bookCopy is available - if yes, delete it. (check and act --> compound action) - might cause race condition in a multithreaded environment where one thread issues the bookCopy and the other deletes it on context switch. - this is not a multithreaded question yet.
        if(dbAccessor.isCopyAvailable(bookCopy)){
            dbAccessor.deleteBookCopy(bookCopy);
        }
    }

    public void blockMember(Member member){
        if(member == null){
            throw new IllegalArgumentException("member can't be null");
        }
        dbAccessor.markAsBlocked(member);
    }

    public void issueBook(BookCopy bookCopy, Member member){
        if(bookCopy == null || member == null){
            throw new IllegalArgumentException("bookCopy/member can't be null");
        }
        if(dbAccessor.isCopyAvailable(bookCopy)){
            dbAccessor.issueBookCopyToMember(bookCopy, member);
        }
    }

    public void submitBook(BookCopy bookCopy, Member member){
        if(bookCopy == null || member == null){
            throw new IllegalArgumentException("bookCopy/member can't be null");
        }
        if(!dbAccessor.isCopyAvailable(bookCopy)){
            dbAccessor.submitBookCopyFromMember(bookCopy, member);
        }
    }

    public Member getBorrower(BookCopy bookCopy) {
        if (bookCopy == null) {
            throw new IllegalArgumentException("bookName can't be null");
        }
        Results results = null;
        if (dbAccessor.isCopyAvailable(bookCopy)) {
            results = dbAccessor.getBorrower(bookCopy);
        }
        return ResultsConverter.convertToMember(results);
    }

    public List<BookCopy> getBorrowedBooks(Member member){
        if(member == null){
            throw new IllegalArgumentException("member can't be null");
        }
        Results results = dbAccessor.getBorrowedBooks(member);
        return ResultsConverter.convertToBookCopies(results);
    }
}
