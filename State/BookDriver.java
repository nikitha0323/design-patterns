package State;

import java.util.Scanner;

public class BookDriver 
{
    private Scanner reader;
    private BabyBook book;
    private static final String[] mainOptions = 
    { "Pick an Animal", 
    "Switch to English", 
    "Switch to Spanish",
    "Switch to French",
    "Quit" 
    };

    public BookDriver() 
    {
        reader = new Scanner(System.in);
        book = new BabyBook();
    }

    public void run() 
    {
        clear();
        System.out.println("Welcome to our Baby Book!");

        while (true) 
        {
            int option = getUserOption();

            clear();
            if (option == 1) 
            {
                playAnimalSound();
            } 
            else if (option == 2) 
            {
                book.pressEnglishButton();
            } 
            else if (option == 3) 
            {
                book.pressSpanishButton();
            } 
            else if (option == 4) 
            {
                book.pressFrenchButton();
            } 
            else if (option == 5) 
            {
                System.out.println("Goodbye");
                break;
            } 
            else 
            {
                System.out.println("Sorry Invalid command");
            }
        }
    }

    private void playAnimalSound() 
    {
        displayAnimalOptions();
        while (true) 
        {
            System.out.print("Enter your animals number: ");
            try 
            {
                int animalNumber = Integer.parseInt(reader.nextLine()) - 1;
                String animal = book.getAnimalList().get(animalNumber);
                book.pressAnimalButton(animal);
                return;
            } 
            catch (Exception e) 
            {
                System.out.println("That is not a valid number");
                continue;
            }
        }
    }

    private void displayAnimalOptions() 
    {
        System.out.println("Animals:");
        int counter = 1;
        for (String animal : book.getAnimalList()) 
        {
            System.out.println(counter + ". " + animal);
            counter++;
        }
    }

    private int getUserOption() 
    {
        for (int i = 0; i < mainOptions.length; i++) 
        {
            System.out.println((i + 1) + ". " + mainOptions[i]);
        }
        return Integer.parseInt(reader.nextLine());
    }

    public void clear() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) 
    {
        BookDriver driver = new BookDriver();
        driver.run();
    }
}
