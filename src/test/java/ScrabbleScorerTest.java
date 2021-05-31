import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleScorerTest {
    private final ScrabbleScorer scorer = new ScrabbleScorer();

    @Test
    public void testTileScore(){
        assertEquals(1,scorer.scoreForTile('A'));
        assertEquals(3,scorer.scoreForTile('B'));
        assertEquals(10,scorer.scoreForTile('Q'));
    }
}