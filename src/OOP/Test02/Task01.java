package OOP.Test02;

/**
 * Created by Ps1X on 16.01.2017.
 */
/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/
public class Task01 {
    public static void main(String[] args) {
        Horce horce = new Horce("Tigra", false, true);
        Horce pegas = new Pegas("Tigroid", true, true);
        horce.proverka();
        pegas.proverka();
    }
}
