package OOP.Test36;


import OOP.Test36.common.BmpReader;
import OOP.Test36.common.JpgReader;
import OOP.Test36.common.PngReader;

/**
 * Created by Ps1X on 25.02.2017.
 */
/*
3. Создай класс ImageReaderFactory с одним методом.
        3.1. Подумай, как он должен называться.
        3.2. Подумай, какие модификаторы должны быть у этого метода.
        4. Этот метод должен:
        4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
        4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
        5. Реализовать метод main. Запустить программу.
*/
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes types) {
        if (types.equals(ImageTypes.BMP)) {
            return new BmpReader();
        } else if (types.equals(ImageTypes.JPG)) {
            return new JpgReader();
        } else if (types.equals(ImageTypes.PNG)) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException("neizvestniy tip image");
        }
    }
}
