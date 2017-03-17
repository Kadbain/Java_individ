package OOP.Test13;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
/* Погода
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/
public static void main(String[] args) {
    Weather today = new Today(WeatherType.cold);
    Weather today1 = new Today(WeatherType.dojd);
    System.out.println(today + " " + today1);

}
}
