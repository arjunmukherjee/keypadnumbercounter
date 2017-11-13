import java.awt.*;
import java.util.List;
import java.util.Set;

interface Moves {
    List<Point> allowedMoves();
    boolean isValidCharacter(char c);
}