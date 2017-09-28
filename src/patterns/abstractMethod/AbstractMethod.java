package patterns.abstractMethod;


/**
 * Created by Ps1X on 18.05.2017.
 */
public class AbstractMethod {
    public static void main(String[] args) {

    }

    interface Mouse {


        void click();

        void dbclick();

        void scroll(int direction);

    }

    interface Keyboard {
        void print();

        void prinln();
    }

    interface Touchpad {
        void track(int deltaX, int deltaY);
    }

    interface DeviceFactory {
        Mouse getMouse();

        Keyboard getKeyboard();

        Touchpad getTouchpad();
    }

    class RuMouse implements Mouse {

        @Override
        public void click() {
            System.out.println("click mishbu");
        }

        @Override
        public void dbclick() {
            System.out.println("dvoinoi shel4ok mishki");
        }

        @Override
        public void scroll(int direction) {
            if (direction > 0) {
                System.out.println("scroll up");
            } else if (direction < 0) {
                System.out.println("scroll down");
            } else {
                System.out.println("no scroll");
            }
        }
    }

    class RuKeyboard implements Keyboard {
        @Override
        public void print() {
            System.out.println("print string");
        }

        @Override
        public void prinln() {
            System.out.println("print string with out enter");
        }
    }

    class RuTouchpad implements Touchpad {
        @Override
        public void track(int deltaX, int deltaY) {
            int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
            System.out.println("move " + s + " picselc");
        }
    }

    class EnMouse implements Mouse {

        @Override
        public void click() {
            System.out.println("click mishbu");
        }

        @Override
        public void dbclick() {
            System.out.println("dvoinoi shel4ok mishki");
        }

        @Override
        public void scroll(int direction) {
            if (direction > 0) {
                System.out.println("scroll up");
            } else if (direction < 0) {
                System.out.println("scroll down");
            } else {
                System.out.println("no scroll");
            }
        }
    }

    class EnKeyboard implements Keyboard {
        @Override
        public void print() {
            System.out.println("print string");
        }

        @Override
        public void prinln() {
            System.out.println("print string with out enter");
        }
    }

    class EnTouchpad implements Touchpad {
        @Override
        public void track(int deltaX, int deltaY) {
            int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
            System.out.println("move " + s + " picselc");
        }
    }

    class EnDeviceFactory implements DeviceFactory {
        @Override
        public Mouse getMouse() {
            return new EnMouse();
        }

        @Override
        public Keyboard getKeyboard() {
            return new EnKeyboard();
        }

        @Override
        public Touchpad getTouchpad() {
            return new EnTouchpad();
        }
    }

    class RuDeviceFactory implements DeviceFactory {

        @Override
        public Mouse getMouse() {
            return new RuMouse();
        }

        @Override
        public Keyboard getKeyboard() {
            return new RuKeyboard();
        }

        @Override
        public Touchpad getTouchpad() {
            return new RuTouchpad();
        }
    }
}