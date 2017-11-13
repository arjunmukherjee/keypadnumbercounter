import java.awt.*;
import java.util.List;
import java.util.Set;

interface Moves {
    List<Point> allowedMoves();
    Set<Character> disallowedCharacters();
}