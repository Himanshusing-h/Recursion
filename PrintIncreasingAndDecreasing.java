import java.util.Scanner;

public class PrintIncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        print(n);
    }

    //one ek baar print hoga
    //Approach 1
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        print(n - 1);
        if (n != 1) {
            System.out.println(n + " ");
        }
    }
}
//Approach 2
//public static void print(int n)
//{
//    if(n==1){
//        System.out.println(1);
//        return;
//    }
//    System.out.println(n+" ");
//    print(n-1);
//    System.out.println(n+" ");
//}
//}
//one do baar print hoga
//    public static void print(int n)
//    {
//        if(n==0){
//            return;
//        }
//        System.out.println(n+" ");
//        print(n-1);
//        System.out.println(n+" ");
//    }
//}
//go through dry run
