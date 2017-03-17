package Niti.Test04;

import java.util.Date;

import static Niti.Test04.Main.sleepNSeconds;

/**
 * Created by Ps1X on 28.02.2017.
 */
public class Violin implements MusicalInstrument {
    private String musician;

    public Violin(String musician) {
        this.musician = musician;
    }

    @Override
    public Date startPlaying() {
        System.out.println(musician + " start playing!");
        return new Date();
    }

    @Override
    public Date stopPlaying() {
        return new Date();
    }

    @Override
    public void run() {
        Date date =  startPlaying();
        sleepNSeconds(2);
        Date endDate = stopPlaying();
        System.out.println(" playing is: " + (endDate.getTime() - date.getTime()));
    }
}
