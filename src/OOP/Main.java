package OOP;

/**
 * Created by Ps1X on 04.05.2017.
 *
 * [8](List el2) [13](List el4) [17](List el3) [] [] // 16 | 0.75
 *
 *  5 3 10 27
 */
class Main{

    public static void main(String...args){
        Tail t = new Tail();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.setTail(t);
        cat2.setTail(t);

        System.out.println(t);
    }

}

class Pet {

}

class Tail{
    void setTail(){

    }
}

class Cat extends Pet{
//   Tail tail = new Tail();
     Tail tail;

    public void setTail(Tail tail) {
       tail.setTail();
    }
}


