package Niti.Test26;


import Niti.Test26.common.*;

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

        } else if (types == ImageTypes.JPG) {
            imageReader = new JpgReader();
        } else if (types == ImageTypes.PNG){
            imageReader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}
