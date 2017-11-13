import java.awt.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Diagonal implements Moves {
    private final List<Point> allowedMoves;
    private final Set<Character> disallowedCharacters;

    public Diagonal() {
        allowedMoves = new LinkedList<>();
        allowedMoves.add(new Point(0,0));
        allowedMoves.add(new Point(1,1));
        allowedMoves.add(new Point(1,-1));
        allowedMoves.add(new Point(-1,-1));
        allowedMoves.add(new Point(-1,1));

        disallowedCharacters = new HashSet<>();
        disallowedCharacters.add('*');
        disallowedCharacters.add('#');
    }

    @Override
    public List<Point> allowedMoves() {
        return allowedMoves;
    }

    @Override
    public Set<Character> disallowedCharacters() {
        return disallowedCharacters;
    }
}
