import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleScorerTest {
    private final ScrabbleScorer scorer = new ScrabbleScorer();

    @Test
    public void testTileScore(){
        assertEquals(1,scorer.scoreForTile('A'));
        assertEquals(3,scorer.scoreForTile('B'));
        assertEquals(10,scorer.scoreForTile('Q'));
    }

    @Test
    public void testTileScoreLowerCase(){
        assertEquals(1,scorer.scoreForTile('a'));
        assertEquals(3,scorer.scoreForTile('b'));
        assertEquals(10,scorer.scoreForTile('q'));
    }

    @Test
    public void testTileScoreNotLetter(){
        assertEquals(0,scorer.scoreForTile('-'));
        assertEquals(0,scorer.scoreForTile(' '));
        assertEquals(0,scorer.scoreForTile('5'));
    }

    @Test
    public void testScoreForWord(){
        assertEquals(3,scorer.scoreForWord("ate"));
        assertEquals(12,scorer.scoreForWord("panther"));
    }

    @Test
    public void testHighestScoringWordEmptyList(){
        List<String> words = new ArrayList<>();
        assertNull(scorer.highestScoringWord(words));
    }

    @Test
    public void testHighestScoringWord(){
        List<String> words = new ArrayList<>();
        words.add("eat");
        words.add("panther");
        words.add("at");
        assertEquals("panther",scorer.highestScoringWord(words));
    }

    @Test
    public void testHighestScoringWordZero(){
        List<String> words = new ArrayList<>();
        words.add("-----");
        assertEquals("-----",scorer.highestScoringWord(words));

    }
}