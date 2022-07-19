import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

            if (word.equals("end"))
            {
                System.out.println("Bye bye!");
                break;
            }
            else if (word.equals("add"))
            {
                System.out.println("Word: ");
                String newWord = this.scanner.nextLine();

                System.out.println("Translation: ");
                String translation = this.scanner.nextLine();

                dictionary.add(newWord, translation);
            }
           else if (word.equals("search"))
            {
                System.out.println("To be translated: ");
                String search = this.scanner.nextLine();

                String tranlsation = dictionary.translate(search);
                if(tranlsation == null)
                    System.out.println("Word "+ search + " was not found" );
                else
                    System.out.println("Translation: "+ tranlsation);
            }
            else
            {
                System.out.println("Unknown command");

            }
        }




    }
}
