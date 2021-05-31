import java.util.List;
import java.util.Map;

public class ScrabbleScorer {
    private final Map<Character,Integer> tileScores;

    public ScrabbleScorer(){
        char[] titles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        //TODO: initialize the array of individual letter scores.
        int[] scores;

        //TODO: create the `tileScores` map
        // TODO: populate the `tileScores` map using hte tiles and `scores` array}
    }
    public int ScoreForTile(char tile){
        //TODO:Convert the tile to an uppercase Character

        //TODO:Check if the `tileScores` map contains this tile

        //TODO:Get the tile from the `tileScores` map

        return 0;
    }

    public int scoreForWord(String word){
        char[] tiles = word.toCharArray();

        //TODO:Calculate the total score of the tiles
        return 0;
    }
    public String highestScoringWord(List<String> words){
        //TODO: Find the word with the highest store

        return null;
    }
}
