package State;

import java.util.ArrayList;

public abstract class State {
    protected BabyBook book;

    public State(BabyBook book) {
        this.book = book;
    }

    public void pressAnimalButton(String animal) {
        String sound = book.getAnimalSound(animal);
        System.out.println("Playing " + animal + " sound: " + sound);
    }

    public abstract void pressEnglishButton();

    public abstract void pressSpanishButton();

    public abstract void pressFrenchButton();
}

