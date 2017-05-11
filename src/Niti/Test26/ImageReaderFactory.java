package Niti.Test26;


import Niti.Test26.common.BmpReader;
import Niti.Test26.common.ImageReader;
import Niti.Test26.common.ImageTypes;

/**
 4. Этот метод должен:
 4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
 4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
 */
public class ImageReaderFactory {
    public static ImageReader imageReader (ImageTypes types) {
        ImageReader imageReader = null;
        if (types == ImageTypes.BMP) {
            imageReader = new BmpReader();

        } else if (types == ImageTypes.BMP)
        return imageReader;
    }
}
