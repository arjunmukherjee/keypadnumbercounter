import java.awt.*;

public class KeypadCounterApp {

    public static void main(String[] args) {
        Point startingPoint = new Point(0,0);
        KeypadNumberCounter knc = new KeypadNumberCounter(startingPoint, new NumericKeypad(), new Diagonal());
        System.out.println("Number of unique 10 digit numbers is " + knc.getCount(10));

        // TODO : Memoize : This is timing out
        // System.out.println("Number of unique 20 digit numbers is " + knc.getCount(20));
    }
}
