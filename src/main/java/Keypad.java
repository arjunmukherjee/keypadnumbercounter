import java.awt.*;

public interface Keypad {
    boolean isWithinBounds(Point point);
    char[][] getKeypad();
}
