public class NumberOperations {
    public void findEvenOdd(int num){
        boolean value=false;
        if(num % 2 == 0){
            System.out.println("The Number "+num+ " is Even");
        }
        else
            System.out.println("The Number "+num+ " is Odd");
    }
    //using 3 variables
    public void swapNumbers(int i, int j){
        int temp;
        System.out.println("Before Swap i = "+i+" j = "+j);
        temp=i;
        i=j;
        j=temp;
        System.out.println("After Swap i = "+i+" j = "+j);
    }
    //without using three variables
    public void swapNum(int i, int j){
        System.out.println("Before Swap i = "+i+" j = "+j);
        i= i+j;  //i=5  j=10 i=15
        j= i-j;  // i=15  j=5
        i= i-j;   // i=10  j=5
        System.out.println("After Swap i = "+i+" j = "+j);
    }

    public boolean isPrime(int num){
        if (num <= 1 ){
            return false;
        }
        for (int i = 2;i < num ;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void primeNosInRange(int range){
        for(int i = 0; i <= range; i++){
            if(isPrime(i)){
                System.out.println(i + " is Prime");
            }
        }
    }

    public void sumOfPrimeInRange(int range){
        int sumOfPrimes=0;
        for (int num = 1; num <= range; num++){
            if (isPrime(num)){
                sumOfPrimes += num;
            }
        }
        System.out.println("Sum : "+sumOfPrimes);
    }
    /* Perfect number, a positive integer that is equal to the sum of its
    proper	divisors. The smallest perfect number is 6,	which is the sum
    of	1,	2,	and	3.		*/
    public void checkPerfectNumber(int num){
        int sum=1;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num)
            System.out.println("The Number "+ num +" is a Perfect Number");
        else
            System.out.println("The Number "+ num +" is not a Perfect Number");
    }
    public boolean isPerfectNumber(int num){
        int sum=1;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num)
            return true;
            //System.out.println("The Number "+ num +" is a Perfect Number");
        else
            return false;
            //System.out.println("The Number "+ num +" is not a Perfect Number");
    }
    public void getPerfectNumbersWithinRange(int range){
        for (int i = 0; i <= range; i++){
            if(isPerfectNumber(i)){
                System.out.println(i + " is a perfect Number");
            }
        }
    }

    public void isPalindrome(int num){
        int originalNum = num;  //123
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;   //3  32  321
            num = num /10;   //12 // 1 // 0
        }
        if(rev == originalNum){
            //return true; // if return type is boolean
            System.out.println("the No. is Palindrome");
        }
        else{
            //return false;
            System.out.println("Not a Palindrome");
        }
    }

    public int findFactorial(int num1) {
        int fact = 1;
        int i = 1;
        while (i <= num1){
            fact *= i;
            i++;
        }
        return fact;
        //System.out.println("The Factorial of " + num1 + " is "+ fact);
    }

    public void findFactorialWithinRange(int range){
        for (int i = 1; i <= range; i++){
            System.out.println("The Factorial of "+i+" is "+findFactorial(i));
        }

    }


    /*
        Strong numbers are the numbers	whose sum of factorial of digits is	equal to the
        original number.
    */
    public void isStrongNumber(int num){
        int originalNum=num;
        int factSum = 0;
        while(num != 0){
            int digit = num % 10;
            factSum += findFactorial(digit);
            num = num / 10;
        }
        if (factSum == originalNum){
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a Strong");
        }
    }
    /*
            FIBONACCI series : a series	of numbers in which	each number(Fibonacci number) is the sum of	the	two
            preceding numbers. The	simplest is the series 1, 1, 2, 3, 5, 8, etc.
    */
    public void fibonacciSeries(int range){
        int num1 = 0;
        int num2 = 1;
        int sum ;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i = 3; i <= range; i++){
            sum = num1 + num2;
            System.out.print(sum+" ");
            num1 = num2;
            num2 = sum;
        }

    }
    public void reverseNumber(int num){
        int reverse = 0;
        while(num != 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("The Reverse of the given No. is: "+ reverse);
    }

    public int findGCD(int num1, int num2) {
        if(num1 < num2)
            return findGCD(num2, num1);
        if(num2 == 0)
            return num1;
        return findGCD(num2 , num1 % num2);
    }
}
