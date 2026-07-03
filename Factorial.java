import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        //calling function
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        //base statement
   if(n==0)
   {
       return 1;


    }
   //applying formula

        int fac= n*factorial(n - 1) ;
   return fac;

    }
}
