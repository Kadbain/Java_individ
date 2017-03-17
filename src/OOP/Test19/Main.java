package OOP.Test19;

/**
 * Created by Ps1X on 31.01.2017.
 */
/* Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое захардкоженое значение типа int
4. Метод getCarsCount() должен возвращать различные значения для различных классов
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.
*/
public class Main {
    public static void main(String[] args) {
        Bridge waterBridge = new WaterBridge();
        Bridge suspensionBridge = new SuspensionBridge();
        orintLn(waterBridge);
        orintLn(suspensionBridge);
    }
    public static void orintLn (Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
