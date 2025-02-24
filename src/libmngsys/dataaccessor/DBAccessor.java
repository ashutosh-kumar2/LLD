package libmngsys.dataaccessor;

import libmngsys.book.BookCopy;
import libmngsys.user.Member;

import java.util.List;

public class DBAccessor {

    public Results getBooksWithName(String bookName){
        return new Results();
    }

    public Results getBooksWithAuthorNames(List<String> authorNames){
        return new Results();
    }

    public Results getMembersWithName(String memberName){
        return new Results();
    }

    public void insertBookCopy(BookCopy bookCopy){

    }

    public void deleteBookCopy(BookCopy bookCopy){

    }

    public void markAsBlocked(Member member){

    }

    public void issueBookCopyToMember(BookCopy bookCopy, Member member){

    }

    public void submitBookCopyFromMember(BookCopy bookCopy, Member member){

    }

    // bookCopy is available means it hasn't been issued to anyone
    public boolean isCopyAvailable(BookCopy bookCopy){
        return true;
    }

    public Results getBorrower(BookCopy bookCopy){
        return new Results();
    }

    public Results getBorrowedBooks(Member member){
        return new Results();
    }

}
