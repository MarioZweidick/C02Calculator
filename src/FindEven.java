public class FindEven
{
    public static void main(String[] args)
    {
        int input = 10;

        while(input > 1)
        {
            if(input  % 2 == 0)
                System.out.println("Zahl ist gerade: " + input);
            input--;
        }

        for(int index = 0; index <= 10; index++)
        {
            if(index % 2 != 0)
                System.out.println("Zahl ist ungerade: " + index);
        }
    }
}
