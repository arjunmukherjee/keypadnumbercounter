import java.awt.*;

public class NumericKeypad implements Keypad {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final char[][] keypad;

    public NumericKeypad() {
        this.keypad = Keypads.NUMERIC_KEY_PAD;
        this.numberOfColumns = this.keypad[0].length;
        this.numberOfRows = this.keypad.length;
    }

    @Override
    public char[][] getKeypad() {
        return keypad;
    }

    @Override
    public boolean isWithinBounds(Point point) {
        return point.y >= 0 && point.y < numberOfRows &&
                point.x >=0 && point.x < numberOfColumns;
    }
}