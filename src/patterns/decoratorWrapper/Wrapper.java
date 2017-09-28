package patterns.decoratorWrapper;


/**
 * Created by Ps1X on 16.06.2017.
 */
public class Wrapper {
    public static void main(String[] args) {
//    PrinterInterface printer = new Printer("Привет");
//        PrinterInterface printer = new QuotesDecorator(new Printer("Привет"));
        PrinterInterface printer = new QuotesDecorator(new LeftBreakDecorator(new RightBreakDecorator(new Printer("Привет"))));
        printer.print();
    }
}
interface PrinterInterface {
    void print();
}
class Printer implements PrinterInterface {
    String value;
    public Printer(String value) {
        this.value = value;
    }
    public void print() {
        System.out.print(value);
    }
}
abstract class Decorator implements PrinterInterface {
    PrinterInterface component;
    public Decorator(PrinterInterface component) {
        this.component = component;
    }
    public void print() {
        component.print();
    }
}
class QuotesDecorator extends Decorator {
    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
class LeftBreakDecorator extends Decorator {
    public LeftBreakDecorator(PrinterInterface component) {
        super(component);
    }
    public void print() {
        System.out.print("{");
        super.print();
    }
}
class RightBreakDecorator extends Decorator {
    public RightBreakDecorator(PrinterInterface component) {
        super(component);
    }
    public void print() {
        super.print();
        System.out.print("}");
    }
}