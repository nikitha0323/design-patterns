package State;

public class SpanishState extends State {
    public SpanishState(BabyBook book) {
        super(book);
    }

    @Override
    public void pressEnglishButton() {
        book.pressEnglishButton();
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish state");
    }

    @Override
    public void pressFrenchButton() {
        book.pressFrenchButton();
    }
}