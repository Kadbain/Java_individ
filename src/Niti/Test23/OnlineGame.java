package Niti.Test23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Поиграем?
Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name) и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.
Итак...
1. Создать класс OnlineGame, сделать его нитью
1.1. создать List<String> steps - он хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
1.2. создать isWinnerFound - он показывает, найден победитель или нет.
1.3. в статик блоке добавить значение шагов
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
1.4. (После пункта 2) создать 3 игрока, игра должна продолжаться, пока не найден победитель

2. Создать класс Gamer, сделать его нитью
2.1 в классе создать private int rating;
2.2 в классе создать конструктор, в нем инциализировать переменную rating. name отправлять в конструктор суперкласса
2.3 Реализуйте логику метода run так, чтобы для каждого игрока:
2.4. За 1 секунду через равные интервалы времени выводились в консоль действия, описанные в steps.
 Количество выведенных действий должно равняться rating.
2.5. Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.
Пример: [Ivanov:Начало игры].
2.6. Когда игрок выполнит все действия из steps, то он считается победителем. Выведите [getName() + ":победитель!"].
2.7. Когда найден победитель, то игра останавливается, и остальные игроки считаются побежденными.
 Выведите для них [getName() + ":проиграл"].
*/
public class OnlineGame extends Thread {
    public volatile static List<String> steps = new ArrayList<>();
    static {
        steps.add("Начало игры");
        steps.add("Сбор ресурсов");
        steps.add("Рост экономики");
        steps.add("Убийство врагов");
    }
    public volatile static boolean isWinnerFound = false;

    @Override
    public void run() {
        Gamer gamer1 = new Gamer("igrok1", 9);
        Gamer gamer2 = new Gamer("igrok2", 2);
        Gamer gamer3 = new Gamer("igrok3", 6);
        List<Gamer> gamers = new ArrayList<>();
        Collections.addAll(gamers, gamer1, gamer2, gamer3);
        for (Gamer gamer : gamers) {
            gamer.start();
        }
        while (!isWinnerFound) {

        }

        for (Gamer gamer : gamers) {
            gamer.interrupt();
        }
    }


}
