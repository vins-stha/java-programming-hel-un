import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Package p = new Package();
        while(true){
            System.out.println("Gift's name:");
            String name = scanner.nextLine();
            if(name.equals(""))
            {
                break;
            }

            System.out.println("Gift's weight:");
            int weight = Integer.valueOf(scanner.nextLine());

            Gift gift = new Gift(name, weight);
            p.addGift(gift);

            System.out.println(gift);
        }
        System.out.println(p);
    }
}
