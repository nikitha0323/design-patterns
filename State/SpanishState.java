package State;

public class SpanishState extends State 
{
    public SpanishState(BabyBook book) 
    {
        super(book);
    }

    public void pressEnglishButton() 
    {
        book.pressEnglishButton();
    }

    public void pressSpanishButton() 
    {
        System.out.println("Already in Spanish state");
    }

    public void pressFrenchButton() 
    {
        book.pressFrenchButton();
    }
}