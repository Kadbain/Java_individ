package Niti.Test07;

/**
 * Created by Ps1X on 07.03.2017.
 */
/* Продвижение на политических дебатах
1. В ввыполняющем классе создать 2 статические переменные:
- int totalCountSpeeches = 200;
- int soundsInOneSpeech = 1000000;
1. Создать класс Politic, унаследовать его от Thread
2. В классе Politic создать приватную переменную int countSounds
3. Создать конструктор с параметром String name и передать этот параметр в конструктор суперкласса
4. Создать метод run и реализовать функционал:
- пока countSounds < totalCountSpeeches * soundsInOneSpeech увеличивать countSounds на один
5. В классе Politic создать метод getCountSpeaches(), который возвращает результат деления countSounds на soundsInOneSpeech
6. В классе Politic переопределить метод toString(), он должен выводить строку "%s сказал речь %d раз",
 где %s - имя нити ( имя политика ), %d - результат метода getCountSpeaches()
7. В выполняющем методе создайте 3 объекта Politic (Иванов, Петров, Сидоров)
7.1 Подождать, пока общее количество сказанных речей всеми политиками не будет равняться переменной totalCountSpeeches
7.1 Вывести на экран toString() каждого объекта
8. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
8.1 Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/
public class Main {
   volatile static int totalCountSpeeches = 200;
   volatile static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politic politic = new Politic("ivanov");
        Politic politic2 = new Politic("petrov");
        Politic politic3 = new Politic("sidorov");
        politic.start();
        politic.join();
        politic2.start();
        politic3.start();
        while (totalCountSpeeches > (politic2.getCountSpeaches()+politic3.getCountSpeaches()+politic.getCountSpeaches()) ) {
            Thread.sleep(10);
        }
        System.out.println(politic.toString());
        System.out.println(politic2.toString());
        System.out.println(politic3.toString());


    }

}
