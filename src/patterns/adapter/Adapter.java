package patterns.adapter;

/**
 * Created by Ps1X on 15.06.2017.
 */
public class Adapter {
    public static void main(String[] args) {
        // from extends
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
        // from composition
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();
    }
}
interface VectorGraphicsInterface {
    void drawLine();
    void drawSquare();
}
class RasterGraphics {
    void drawRasterLine() {
        System.out.println("risuem liniu");
    }
    void drawRasterSquare(){
        System.out.println("risuem kvadrat");
    }
}
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{
    public void drawLine() {
        drawRasterLine();
    }
    public void drawSquare() {
        drawRasterSquare();
    }
}
class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = null; //new RasterGraphics();

    public VectorAdapterFromRaster2(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }

    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
