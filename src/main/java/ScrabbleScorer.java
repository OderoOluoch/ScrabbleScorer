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

        //initialize the array of individual letter scores.
        int[] scores = new int[]{
                1,3,2,1,4,2,4,1,8,5,1,3,
                1,1,3,10,1,1,1,1,4,4,8,4,10
        };

        //create the `tileScores` map
        tileScores = new HashMap<>();

        //populate the `tileScores` map using hte tiles and `scores` array}
        for(int i =0; i < tiles.length; i++){
            char tile = tiles[i];
            int score = scores[i];
            tileScores.put(tile,score);
        }

    }


    /*
        Calculate the score for an individual letter tile.
        If the character is not a letter, then 0 is returned.
    */
    public int ScoreForTile(char tile){
        //Convert the tile to an uppercase Character
        tile = Character.toUpperCase(tile);

        //TODO:Check if the `tileScores` map contains this tile
        if(tileScores.containsKey(tile)){

            //TODO:Get the tile from the `tileScores` map
        }else{
            return 0;
        }
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
