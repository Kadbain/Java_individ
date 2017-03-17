package OOP.Test29;

/**
 * Created by Ps1X on 07.02.2017.
 */
/* ООП - наследование животных
1. Создать класс BigAnimal с методом protected String getSize(), который возвращает строку "как динозавр".
1. Создать класс SmallAnimal с методом String getSize(), который возвращает строку "как кошка".
1. Создать public static класс Goose(Гусь).
2. Создать public static класс Dragon(Дракон).
3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].
*/
public class Main {
    public static void main(String[] args) {
        BigAnimal dragon = new Dragon();
        SmallAnimal cat = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(cat.getSize());
    }
}
