package State;

public class FrenchState extends State {
    public FrenchState(BabyBook book) {
        super(book);
    }

    @Override
    public void pressEnglishButton() {
        book.setState(new EnglishState(book));
    }

    @Override
    public void pressSpanishButton() {
        book.setState(new SpanishState(book));
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French state");
    }
}

