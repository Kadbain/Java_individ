package patterns.facade;

import OOP.Test21.ComItem;

/**
 * Created by Ps1X on 08.05.2017.
 */
public class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();

    }
}

class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);

    }
}

class Power {
    void on() {
        System.out.println("включение питания");
    }

    void off() {
        System.out.println("выключение питания");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("производится копирование данных с диска");
        } else {
            System.out.println("вставьте диск с данными");
        }

    }
}
