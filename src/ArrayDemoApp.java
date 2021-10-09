import java.util.Scanner;

public class ArrayDemoApp
{
    public static void main(String[] args)
    {
        //Arrays üben

        double[] articles = new double[5];
        String[] descriptions = new String[5];
        double result = 0;

        for(int i = 0; i < articles.length; i++)
        {
            Scanner scanner  = new Scanner (System.in);
            System.out.print("\nGeben Sie Ihren " + (i+1)  + ". Artikel ein: ");
            descriptions[i] = scanner.nextLine();
            System.out.print("\nDas kostet ein(e) " +  descriptions[i]  + ":");
            articles[i] =  scanner.nextDouble();
        }

        for(int j = 0; j < articles.length; j++)
        {
            if(j == 0)
            {
                System.out.println("IHRE EINKAUFSLISTE HERR ZWEIDICK: ");
                System.out.println("----------------------------------");
            }
            System.out.println("Artikel: " + descriptions[j] + " kostet " + articles[j] + "€");
            result += articles[j];
        }

        System.out.println("Die Summe Ihres Einkaufs ist: " + result + "€");

        System.out.println("Der teuerste Artikel kostet: " + findMostExpensive(articles));
    }

    public static double findMostExpensive(double[] articles)
    {
        double max = 0;
        String mostExpensive = new String("");
        for(int i = 0; i < articles.length; i++)
        {
            if (articles[i] > max)
            {
                max = articles[i];
            }
        }

        return max;
    }
}
