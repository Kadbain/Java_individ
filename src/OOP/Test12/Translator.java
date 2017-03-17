package OOP.Test12;

/**
 * Created by Ps1X on 19.01.2017.
 */
public abstract class Translator {
    abstract String getLanguage();
    public String translate() {
        return "Я переводчик с " + getLanguage();
    }

}
