import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
       System.out.println(reverse(0,num));
        //reverse using loop
        //We will convert this to recursive method
//        int rev = 0;
//        while (num != 0) {
//            rev = rev * 10 + num % 10;
//            num = num / 10;
//
//        }
//        System.out.println(rev);
    }

    public static int reverse(int rev,int num)
    {
        //At the end of recursion we will return rev as we know rev is our answer
      if(num==0)return rev ;
//until n!=0 we will recursivly call the function
       return  reverse(rev*10+num%10,num/10);

    }
}
