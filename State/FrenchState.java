package State;

public class FrenchState extends State {
    public FrenchState(BabyBook book) {
        super(book);
    }

    @Override
    public void pressEnglishButton() {
        book.pressEnglishButton();
    }

    @Override
    public void pressSpanishButton() {
        book.pressSpanishButton();
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French state");
    }
}

