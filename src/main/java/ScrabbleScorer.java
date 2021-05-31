import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    This class scores words in the game of Scrabble.
    A word's score is the total of its individual tile scores.
*/

public class ScrabbleScorer {
    private final Map<Character,Integer> tileScores;

    public ScrabbleScorer(){
        char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        //TODO: initialize the array of individual letter scores.
        int[] scores;

        tileScores = new HashMap<>();

        //TODO: create the `tileScores` map
        // TODO: populate the `tileScores` map using hte tiles and `scores` array}
    }



    /*
        Calculate the score for an individual letter tile.
        If the character is not a letter, then 0 is returned.
    */
    public int ScoreForTile(char tile){
        //TODO:Convert the tile to an uppercase Character

        //TODO:Check if the `tileScores` map contains this tile

        //TODO:Get the tile from the `tileScores` map

        return 0;
    }


    /*
    * Calculate the score for a word
    */

    public int scoreForWord(String word){
        char[] tiles = word.toCharArray();

        //TODO:Calculate the total score of the tiles
        return 0;
    }


    /*
    * Return the highest-scoring word from a list of words,
    * or null if the list is empty
    */
    public String highestScoringWord(List<String> words){
        //TODO: Find the word with the highest store

        return null;
    }
}
