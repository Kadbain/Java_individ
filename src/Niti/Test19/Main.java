package Niti.Test19;

/**
 * Created by Ps1X on 29.04.2017.
 */
/* Последовательные выполнения нитей
1. В выполняющем классе создать статическую переменную int COUNT = 4
2. Создать класс SleepingThread, унаследовать его от Thread
3. В классе SleepingThread переопределить метод toString()
- Определить формат вывода, что бы он выводил нити, так как показано в примере: "#" + getName() + ": " + countDownIndex,
 где countDownIndex - число от COUNT до 1
4. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1,
 потом для нити №2 с COUNT до 1 и т.д.
5. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана", если нить будет прервана.
6. Подумать, как должен быть реализован метод main

Пример:
#1: 4
#1: 3
...
#1: 1
#2: 4
...
*/
public class Main {
    public static int count = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            new SleepingThread().join();
        }
    }
}
