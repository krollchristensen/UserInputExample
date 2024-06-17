import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Læs brugerens navn
        System.out.print("Indtast dit navn: ");
        String name = input.nextLine();

        // Læs brugerens alder
        System.out.print("Indtast din alder: ");
        int age = input.nextInt();

        // Læs brugerens yndlingsdecimaltal
        System.out.print("Indtast dit yndlingsdecimaltal: ");
        double favoriteNumber = input.nextDouble();

        // Udskriv en besked med de indlæste værdier
        System.out.println("Hej, " + name + "! Du er " + age + " år gammel og dit yndlingsdecimaltal er " + favoriteNumber + ".");

        input.close();
    }
}
