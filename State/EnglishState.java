package State;

public class EnglishState extends State 
{
    public EnglishState(BabyBook book) 
    {
        super(book);
    }

    public void pressEnglishButton() 
    {
        System.out.println("Already in English state");
    }

    
    public void pressSpanishButton() 
    {
        book.pressSpanishButton();
    }

    public void pressFrenchButton() 
    {
        book.pressFrenchButton();
    }
}