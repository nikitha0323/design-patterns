package State;

public abstract class State 
{
    protected BabyBook book;

    public State(BabyBook book) 
    {
        this.book = book;
    }

    public abstract void pressEnglishButton();

    public abstract void pressSpanishButton();

    public abstract void pressFrenchButton();
}