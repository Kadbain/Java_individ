package Niti.Test25;

/**
 * Created by Ps1X on 11.05.2017.
 */
public interface ReadFileInterface {
    void setFileName(String fullFileName);

    String getFileContent();

    void join() throws InterruptedException;

    void start();
}
