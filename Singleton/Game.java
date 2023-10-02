package Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game 
{
    private static Game game = null;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() 
    {
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<>();
        score = 0;

        // Load anagrams from files
        for (Difficulty difficulty : Difficulty.values()) 
        {
            anagrams.put(difficulty, FileReader.getAnagrams(difficulty));
        }

        // Initialize the first question
        loadNextAnagram();
    }

    public static Game getInstance() 
    {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public String getQuestion() 
    {
        return currentAnagram.getQuestion();
    }

    public boolean isCorrect(String userAnswer) 
    {
        boolean correct = currentAnagram.isCorrect(userAnswer);
        if (correct) 
        {
            score++;
        }
        loadNextAnagram();
        return correct;
    }

    public int getScore() 
    {
        return score;
    }

    private void loadNextAnagram() 
    {
        ArrayList<Anagram> anagramList = anagrams.get(level);
        if (anagramList != null && !anagramList.isEmpty()) 
        {
            int index = rand.nextInt(anagramList.size());
            currentAnagram = anagramList.get(index);
            anagramList.remove(index);
        } else 
        {
            currentAnagram = null;
        }
    }
}
