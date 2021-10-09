public class ArithmetischeOperatoren
{

    public static void main(String[] args)
    {
        int i1 = 4;
        int i2 = 0;

        //Addition
        System.out.println(i1+i2);

        //Subtraction
        System.out.println(i1-i2);

        //Multiplication
        System.out.println(i1*i2);

        //Division
        System.out.println((double)i2/i1);

        //Modulo
        //System.out.println(i1%i2);

        //Check if first number is bigger
        System.out.println(bIsFirstBigger(i1, i2));

        printResultInt(i1+i2);
        printResultInt(add(i1,i2));

        printResultInt(add(i1,i2));
        printResultInt(sub(i1,i2));
        printResultInt(multi(i1,i2));
        printResultDouble(div(i1,i2));
        printResultInt(mod(i1, i2));
    }

    /*Method: bIsFirstBigger
    Input:  zahl1...first number
            zahl2...second number
    Output  true...first number is bigger
            false...first number is smaller than one*/
    public static boolean bIsFirstBigger(int zahl1, int zahl2)
    {
        return (zahl1 > zahl2) ? true : false;
    }

    /*Method: add
    Input:  zahl1...first number
            zahl2...second number
    Output  return addition of zahl1 and zahl2*/
    public static  int add (int a, int b)
    {
        return a+b;
    }

    /*Method: sub
    Input:  zahl1...first number
        zahl2...second number
    Output  return subtraction of zahl1 and zahl2*/
    public static  int sub (int a, int b)
    {
        return a-b;
    }

    /*Method: multi
Input:  zahl1...first number
        zahl2...second number
Output  return multiplication of zahl1 and zahl2*/
    public static  int multi (int a, int b)
    {
        return a*b;
    }

    /*Method: div
Input:  zahl1...first number
        zahl2...second number
Output  return division of zahl1 and zahl2*/
    public static  double div (int a, int b)
    {
        if(b > 0)
        {
            int erg = a/b;
            return erg;
        } else
        {
            return 0.0;
        }
    }
    /*Method: mod
    Input:  zahl1...first number
            zahl2...second number
    Output  return result of modulo division of zahl1 and zahl2*/
    public static  int mod (int a, int b)
    {
        if(b > 0)
        {
            return a%b;
        }
        return -1;
    }

    public static void printResultDouble(double result)
    {
        System.out.println(result);
    }

    public static void printResultInt(int result)
    {
        System.out.println(result);
    }

    public static int nTimesTwo(int zahl)
    {
        return zahl * 2;
    }

    public static double nTimesPi(int zahl)
    {
        return zahl * Math.PI;
    }
}
