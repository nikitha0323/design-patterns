package State;

import java.util.HashMap;
import java.util.ArrayList;

public class BabyBook {
    private static BabyBook instance;
    private State state;
    private HashMap<String, String> animalSounds;

    BabyBook() {
        state = new EnglishState(this);
        initializeAnimalSounds();
    }

    public static BabyBook getInstance() {
        if (instance == null) {
            instance = new BabyBook();
        }
        return instance;
    }

    private void initializeAnimalSounds() {
        animalSounds = new HashMap<>();
        animalSounds.put("bird", "Tweet");
        animalSounds.put("cat", "Meow");
        animalSounds.put("chicken", "Cluck");
        animalSounds.put("dog", "Woof");
        animalSounds.put("horse", "Neigh");
        animalSounds.put("mouse", "Sqeek");
        animalSounds.put("sheep", "Baah");
    }


    public void pressAnimalButton(String animal) {
        String sound = animalSounds.get(animal);
        System.out.println("Playing " + animal + " sound: " + translateSound(sound));
    }

    private String translateSound(String sound) {
        if (state instanceof SpanishState) {
            return translateToSpanish(sound);
        } else if (state instanceof FrenchState) {
            return translateToFrench(sound);
        } else {
            return sound; 
        }
    }

    private String translateToSpanish(String sound) {
        switch (sound) {
            case "Tweet": return "pío";
            case "Meow": return "miau";
            case "Cluck": return "coc co co coc";
            case "Woof": return "Guau";
            case "Neigh": return "relinchar";
            case "Sqeek": return "cui-cui";
            case "Baah": return "bee, mee";
            default: return sound;
        }
    }

    private String translateToFrench(String sound) {
        switch (sound) {
            case "Tweet": return "Cui Cui";
            case "Meow": return "Miaou";
            case "Cluck": return "Cotcotcodet";
            case "Woof": return "Ouaf Ouaf";
            case "Neigh": return "NeHiiiiigh";
            case "Sqeek": return "Chicotement";
            case "Baah": return "Bêlement";
            default: return sound; 
        }
    }


    public void pressEnglishButton() {
        state = new EnglishState(this);
    }

    public void pressSpanishButton() {
        state = new SpanishState(this);
    }

    public void pressFrenchButton() {
        state = new FrenchState(this);
    }

    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }
}
