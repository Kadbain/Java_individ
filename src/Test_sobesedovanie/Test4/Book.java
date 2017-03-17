package Test_sobesedovanie.Test4;

/**
 * Created by Ps1X on 07.02.2017.
 */
abstract public class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    abstract Book getBook();
    abstract String getName();
    public String getOutputByBookType() {
        String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
        String markTwainOutput = getBook().getName() + " book was written by " + author;
        String outPut = "";

        if (this instanceof AgathaChristieBook) {
            outPut = agathaChristieOutput;
        } else if (this instanceof MarkTwainBook)
            outPut = markTwainOutput;
            return outPut;
    }

    @Override
    public String toString() {
        return getOutputByBookType();
    }
}
