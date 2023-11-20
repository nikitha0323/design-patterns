package State;

public class EnglishState extends State {
    public EnglishState(BabyBook book) {
        super(book);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Already in English state");
    }

    @Override
    public void pressSpanishButton() {
        book.pressSpanishButton();
    }

    @Override
    public void pressFrenchButton() {
        book.pressFrenchButton();
    }
}