package Niti.Test26;

import Niti.Test26.common.*;
import Niti.Test26.common.ImageReader;
import Niti.Test26.common.ImageTypes;
import OOP.Test36.*;

/**
 * Created by Ps1X on 11.05.2017.
 */
/* Factory method pattern
1. Создай enum класс ImageTypes с списоком доступных форматов BMP, JPG, PNG;
1. Создай интерфейс-маркер ImageReader
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader,
которые реализуют интерфейс ImageReader.
3. Создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
5. Реализовать метод main. Запустить программу.
*/
public class Main {
    public static void main(String[] args) {

        ImageReader imageReader = ImageReaderFactory.imageReader(ImageTypes.BMP);
        System.out.println(imageReader);
    }
}
