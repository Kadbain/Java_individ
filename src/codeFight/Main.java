package codeFight;

class Parent {
    public Parent(String s){
        print("created");
    }

    public static void print(String s){
        System.out.println("Parent: " + s);
    }
}

public class Main extends Parent {

    public Main(String s) {
        super(s);
    }

    public static void print(String s){
        System.out.println("Child: " + s);
    }
    public static void main(String[] args){
        Main child = new Main("t");
        print("created");
    }
}


