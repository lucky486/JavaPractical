import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        int i , num1, num2;
        int[] arr = {111,221,428,13,372,45};
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter integer numerator  :  ");
            num1 = input.nextInt();
            System.out.print("Enter integer Denominator  :  ");
            num2 = input.nextInt();
            System.out.print("Enter array index you want to access  :  ");
            i = input.nextInt();
            System.out.println("Division of the two integers  :  "+(num1/num2));
            System.out.println("Array Element array["+i+"]    :  "+arr[i]);
            input.close();
        }
        catch(ArithmeticException e)
        {
            System.out.println("\nArithmetic Exception Caught!!!\nDivide by zero error.\nCheck your denominator");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nArrayIndex Out Of Bounds Exception Caught!!!\nCheck the array index you are trying to access.");
        }
        catch(Exception n)
        {
            System.out.println("\nNumber Format Exception Caught!!!\nUse integers as Numerator and Denominator");
        }
        System.out.println("End of Exception Handeling!!!");
    }
}
