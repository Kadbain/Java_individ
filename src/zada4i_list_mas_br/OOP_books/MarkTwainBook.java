package zada4i_list_mas_br.OOP_books;

/**
 * Created by Ps1X on 07.02.2017.
 */
public class MarkTwainBook extends Book{
    String bookName;

    public MarkTwainBook(String bookName) {
        super("MarkTwainBook");
        this.bookName = bookName;
    }



    @Override
    MarkTwainBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return bookName;
    }
}
