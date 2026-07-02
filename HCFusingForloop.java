import java.util.Scanner;

public class HCFusingForloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=sc.nextInt();
        System.out.println("enter second number");
        int second=sc.nextInt();
        int i;
        if(first>second) i=second;
        else{
             i=first;
        }
        System.out.println(hcf(i,first,second));
        //calculating hcf using for loop
//        int HCF=-1;
//        for (int i=1;i<=first;i++)
//        {
//            if(first%i==0 && second%i==0)
//            {
//                HCF=i;
//
//            }
//        }
//        System.out.println(HCF);

    }
    public static int hcf(int i,int one,int two){
        if(one%i==0 && two%i==0)return i ;
        return hcf(i-1,one,two);

    }
}
