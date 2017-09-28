package zada4i_list_mas_br.OOP_books;

/**
 * Created by Ps1X on 07.02.2017.
 */
public class AgathaChristieBook extends Book {
    String nameBook;

    public AgathaChristieBook(String nameBook) {
        super("Agata kristi");
        this.nameBook = nameBook;
    }


    @Override
    AgathaChristieBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return nameBook;
    }
}
