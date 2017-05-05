package OOP;

/**
 * Created by Ps1X on 04.05.2017.
 */
class Main{

    public static void main(String...args){
        System.out.println(C.x);

    }

}

class B {
    static{
        System.out.println("static B1");
    }
    {
        System.out.println("non static B1");
    }
    B(){
        System.out.println("B");
    }
}
class C extends B{
    static int x = 5;
    static{
        System.out.println("static C1");
    }
    {
        System.out.println("non static C1");
    }
    C(){
        this("Hello");
        System.out.println("C1");
    }
    C(String str){
        System.out.println("C2");
    }
    {
        System.out.println("non static C2");
    }
}
