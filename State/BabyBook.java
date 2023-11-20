package State;

import java.util.ArrayList;
import java.util.HashMap;

public class BabyBook {
    private State state;
    private HashMap<String, String> animalSounds;

    public BabyBook() {
        state = new EnglishState(this);
        initializeAnimalSounds();
    }

    private void initializeAnimalSounds() {
        // Initialize animal sounds in English
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
        state.pressAnimalButton(animal);
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

    public void setState(State state) {
        this.state = state;
    }

    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }

    public String getAnimalSound(String animal) {
        return animalSounds.get(animal);
    }

    public ArrayList<String> getTranslatedAnimalList() {
        ArrayList<String> translatedList = new ArrayList<>();
        for (String animal : getAnimalList()) {
            translatedList.add(translateAnimal(animal));
        }
        return translatedList;
    }

    private String translateAnimal(String animal) {
        String translatedName = animal;
        String translatedSound = animalSounds.get(animal);
    
        System.out.println("Current state: " + state.getClass().getSimpleName());
    
        // Add more translations for other languages if needed
        if (state instanceof SpanishState) {
            switch (animal) {
                case "bird": translatedName = "Pájaro"; break;
                case "cat": translatedName = "Gato"; break;
                case "chicken": translatedName = "Gallina"; break;
                case "dog": translatedName = "Perro"; break;
                case "horse": translatedName = "Caballo"; break;
                case "mouse": translatedName = "Ratón"; break;
                case "sheep": translatedName = "Oveja"; break;
            }
        } else if (state instanceof FrenchState) {
            switch (animal) {
                case "bird": translatedName = "oiseau"; break;
                case "cat": translatedName = "chat"; break;
                case "chicken": translatedName = "poulet"; break;
                case "dog": translatedName = "chien"; break;
                case "horse": translatedName = "cheval"; break;
                case "mouse": translatedName = "souris"; break;
                case "sheep": translatedName = "mouton"; break;
            }
        }
    
        System.out.println("Translated name: " + translatedName);
        return translatedName + ": " + translateSound(translatedSound);
    }
    


    private String translateSound(String sound) {
        // Add more translations for other languages if needed
        if (state instanceof SpanishState) {
            switch (sound) {
                case "Tweet": return "pío";
                case "Meow": return "miau";
                case "Cluck": return "coc co co coc";
                case "Woof": return "Guau";
                case "Neigh": return "relinchar";
                case "Sqeek": return "cui-cui";
                case "Baah": return "bee, mee";
                default: return sound; // Default to original if translation not found
            }
        } else if (state instanceof FrenchState) {
            switch (sound) {
                case "Tweet": return "Cui Cui";
                case "Meow": return "Miaou";
                case "Cluck": return "Cotcotcodet";
                case "Woof": return "Ouaf Ouaf";
                case "Neigh": return "NeHiiiiigh";
                case "Sqeek": return "Chicotement";
                case "Baah": return "Bêlement";
                default: return sound; // Default to original if translation not found
            }
        } else {
            return sound; // Default to original if not in Spanish or French state
        }
    }
}
