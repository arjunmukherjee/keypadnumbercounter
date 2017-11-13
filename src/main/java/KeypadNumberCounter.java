import java.awt.*;

public class KeypadNumberCounter {

    private final Keypad keypad;
    private Point startingPoint;
    private final Moves moves;

    public KeypadNumberCounter(Point startingPoint, Keypad keypad, Moves moves) {
        this.startingPoint = startingPoint;
        this.moves = moves;
        this.keypad = keypad;
    }

    public int getCount(int numberOfDigits) {
        return getCountRecursive(startingPoint, numberOfDigits);
    }

    public void setStartingPoint(Point startingPoint) {
        this.startingPoint = startingPoint;
    }

    private int getCountRecursive(Point localStartPoint, int numberOfDigits) {
        if (numberOfDigits <= 1) {
            return numberOfDigits;
        }

        int totalCount = 0;
        for(Point point: moves.allowedMoves()) {
            Point newPoint = new Point(localStartPoint.x + point.x, localStartPoint.y + point.y);
            if (isValidPoint(newPoint)) {
                totalCount = totalCount + getCountRecursive(newPoint, numberOfDigits-1);
            }
        }

        return totalCount;
    }

    private boolean isValidPoint(Point point) {
        return this.keypad.isWithinBounds(point) &&
                this.moves.isValidCharacter(keypad.getKeypad()[point.y][point.x]) &&
                this.moves.isValidCharacter(keypad.getKeypad()[point.y][point.x]);
    }
}




