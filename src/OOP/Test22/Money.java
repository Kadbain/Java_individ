package OOP.Test22;

/**
 * Created by Ps1X on 02.02.2017.
 * 1. Создать абстрактный класс Money
 1.0 Реализуй метод getAmount в классе Money:
 1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
 1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
 1.3. В конструкторе присвой ей значение, полученное параметром.
 1.4. Создай абстрактный метод    String getCurrencyName();
 */
abstract public class Money {
    private int amount;
     int getAmount() {
    return amount;
    }

    public Money(int amount) {
        this.amount = amount;
    }
    abstract String getCurrencyName();
}
