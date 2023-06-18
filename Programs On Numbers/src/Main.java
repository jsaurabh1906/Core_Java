import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        NumberOperations op= new NumberOperations();
        //op.findEvenOdd(num);
       //op.swapNumbers(num1,num2);
        //op.swapNum(num1,num2);
       /* if(op.isPrime(num1))
            System.out.println("Prime");
        else
            System.out.println("not prime");*/

        //op.primeNosInRange(num1);
       // op.sumOfPrimeInRange(num1);
       // op.checkPerfectNumber(num1);
       // op.getPerfectNumbersWithinRange(num1);
        //op.isPalindrome(num1);
        //op.findFactorial(num1);
        //op.findFactorialWithinRange(num1);
        //op.isStrongNumber(num1);
        //op.fibonacciSeries(num1);
        //op.reverseNumber(num1);
        int gcd = op.findGCD(num1,num2);
        System.out.println("gcd: " + gcd);


    }
}