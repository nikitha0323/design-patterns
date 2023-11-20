package State;

public class FrenchState extends State 
{
    public FrenchState(BabyBook book) 
    {
        super(book);
    }

    public void pressEnglishButton() 
    {
        book.pressEnglishButton();
    }

    public void pressSpanishButton() 
    {
        book.pressSpanishButton();
    }

    public void pressFrenchButton() 
    {
        System.out.println("Already in French state");
    }
}

