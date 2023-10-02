package Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private static Game instance;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() {
        rand = new Random();
        level = Difficulty.EASY; // Default difficulty level
        anagrams = new HashMap<>();
        score = 0;
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void setDifficulty(Difficulty difficulty) {
        level = difficulty;
    }

    public String getQuestion() {
        // Get a random anagram question from the current difficulty level
        ArrayList<Anagram> anagramList = anagrams.get(level);
        if (anagramList == null) {
            return "No anagrams available for this difficulty level.";
        }
        int randomIndex = rand.nextInt(anagramList.size());
        currentAnagram = anagramList.get(randomIndex);
        return currentAnagram.getQuestion();
    }

    public boolean isCorrect(String userAnswer) {
        if (currentAnagram == null) {
            return false; // No current question set
        }
        // Check if the user's answer is correct (case-insensitive)
        for (String answer : currentAnagram.getAnswers()) {
            if (userAnswer.equalsIgnoreCase(answer)) {
                score++;
                return true;
            }
        }
        return false;
    }

    public int getScore() {
        return score;
    }
}
