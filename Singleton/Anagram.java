package Singleton;

import java.util.ArrayList;

public class Anagram {
    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public boolean isCorrect(String userAnswer) {
        // Check if the user's answer is correct (case-insensitive)
        for (String answer : answers) {
            if (userAnswer.equalsIgnoreCase(answer)) {
                return true;
            }
        }
        return false;
    }
}

