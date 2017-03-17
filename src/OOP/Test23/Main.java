package OOP.Test23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ps1X on 09.02.2017.
 */
/* ООП
1. Создать интерфейс Alive с методом Object containsBones().
2. Создать класс BodyPart, который реализует интерфейс Alive.
2.1 Создать приватную переменную name и сделать конструктор для инициализации.
2.2 Метод containsBones должен возвращать тип Object и значение "Yes"
2.3 Переопределить метод toString(), он должен возвращать name + " содержит кости", если containsBones().equals("Yes") возвращает true,
или он должен возвращать name + " не содержит кости", если containsBones().equals("Yes") возвращает false.
3. Создать класс Finger, который наследуется от класса BodyPart.
3.1 Создать приватную переменную boolean isFoot (это стопа?), переопределить конструктор супер-класса, добавить инициализацию
переменной isFoot
3.2 Переопределить метод containsBones, он должен возвращать тип Object и значение "Yes" вместо true,
если super.containsBones().equals("Yes") && !isFoot, или "No" вместо false
4. Создать метод printlnBodyParts():
- В методе создать список частей тела, добавить в этот список 4 объекта BodyPart (Рука, Нога, Голова, Тело)
- Вывести на экран каждый объект
5. Создать метод printlnFingers():
- В методе создать список пальцев, добавить в этот список 5 объектов Finger
(Большой - рука, Указательный - рука, Средний - стопа, Безымянный - стопа, Мезинец - рука)
- Вывести на экран каждый объект
6. Вызвать методы в main.
*/
public class Main {
    public static void main(String[] args) {
        printlnBodyParts();
        printlnFinger();
    }
    public static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<>();
        BodyPart hand = new BodyPart("Ruka ");
        BodyPart feet = new BodyPart("Noga ");
        BodyPart head = new BodyPart("Golova ");
        BodyPart chest = new BodyPart("Telo ");
        Collections.addAll(bodyParts, hand, feet, head, chest);
        for (BodyPart bodyPart : bodyParts) {
            System.out.println(bodyPart);
        }
    }

    public static void printlnFinger() {
        List<BodyPart> bodyParts = new ArrayList<>();
        BodyPart hand = new Finger("Bolshoy ", false);
        BodyPart hand1 = new Finger("Ukazatelniy ", false);
        BodyPart feet = new Finger("sredniy ", true);
        BodyPart feet1 = new Finger("bezimyanniy ", true);
        BodyPart hand2 = new Finger("Mezinec ", false);
        Collections.addAll(bodyParts, hand, feet, feet1, hand1, hand2);
        for (BodyPart bodyPart : bodyParts) {
            System.out.println(bodyPart);
        }
    }
}
