package patterns.factory_method;

import java.util.Date;

/**
 * Created by Ps1X on 08.05.2017.
 */
public class FactoryMethod {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.timeWatch();
    }
public static WatchMaker getMakerByName (String maker) {
    if (maker.equals("Digital")) {
        return new DigitalWatchMaker();
    } else if (maker.equals("Rome")) {
        return new RomeWatchMaker();
    }
    throw new RuntimeException("не поддерживаемая форма часов" + maker);
}
}

interface Watch {
    void timeWatch();
}

class DigitalWatch implements Watch {

    @Override
    public void timeWatch() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {

    @Override
    public void timeWatch() {
        System.out.println("Rome watch");
    }
}

interface WatchMaker {
    Watch createWatch();
}
class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}