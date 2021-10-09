import java.util.Scanner;

public class InvoiceBuilderApp
{
    public static void main(String[] args)
    {
        double article1 = 0;
        double article2 = 0;
        double article3 = 0;
        double article4 = 0;
        double article5 = 0;
        double sum = 0;

        System.out.println("Geben Sie den Preis für den ersten Artikel ein: ");
        Scanner scanner = new Scanner(System.in);
        article1 =scanner.nextDouble();

        System.out.println("Geben Sie den Preis für den zweiten Artikel ein: ");
        article2 =scanner.nextDouble();

        System.out.println("Geben Sie den Preis für den dritten Artikel ein: ");
        article3 =scanner.nextDouble();

        System.out.println("Geben Sie den Preis für den vierten Artikel ein: ");
        article4 =scanner.nextDouble();
        System.out.println("Geben Sie den Preis für den fünften Artikel ein: ");
        article5 =scanner.nextDouble();

        sum = article1 + article2 + article3 + article4 + article5;

        System.out.println("IHRE RECHNUNG Herr Zweidick\n");
        System.out.println("Artikel 1: " + article1 + "€");
        System.out.println("Artikel 2: " + article2 + "€");
        System.out.println("Artikel 3: " + article3 + "€");
        System.out.println("Artikel 4: " + article4 + "€");
        System.out.println("Artikel 5: " + article5 + "€");
        System.out.println("----------------------------");
        System.out.println("MwSt: " + (sum/5) + "€");
        System.out.println("Gesamtbetrag: " + (sum +(sum/5)) + "€");
    }
}
