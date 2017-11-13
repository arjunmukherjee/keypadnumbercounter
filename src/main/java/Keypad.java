
public class Keypad {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final char[][] keypad;

    public Keypad(char[][] keypad) {
        this.keypad = keypad;
        this.numberOfColumns = this.keypad[0].length;
        this.numberOfRows = this.keypad.length;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public char[][] getKeypad() {
        return keypad;
    }
}