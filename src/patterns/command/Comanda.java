package patterns.command;

/**
 * Created by Ps1X on 04.07.2017.
 */
public class Comanda {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));
        user.startComputer();
        user.stopComputer();
        user.resetCompiter();
    }
}
interface Command {
    void execute();
}
//Reciver
class Comp {
    void start () {
        System.out.println("start");
    }
    void stop () {
        System.out.println("stop");
    }
    void reset(){
        System.out.println("reset");
    }
}
class StartCommand implements Command {
    Comp computer;
    public StartCommand(Comp computer) {
        this.computer = computer;
    }
    public void execute() {
    computer.start();
    }
}
class StopCommand implements Command {
    Comp computer;
    public StopCommand(Comp computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.stop();
    }
}
class ResetCommand implements Command {
    Comp computer;
    public ResetCommand(Comp computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.reset();
    }
}
//invoker
class User {
    Command start;
    Command stop;
    Command reset;
    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }
    void startComputer () {
        start.execute();
    }
    void stopComputer() {
        stop.execute();
    }
    void resetCompiter() {
        reset.execute();
    }
}